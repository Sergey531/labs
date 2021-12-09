package Labs.lab4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class SaveLoad {
    private static FileOutputStream outFile;
    private static FileInputStream inFile;

    public void Save(Storage storage , String fileWay)throws IOException{
        System.out.println("Saving****************");
        byte[] bytesToWrite;
        int[] dots= new int[3];
        byte[] dotsByte = new byte[8];
        char razdelitel = '.';
        byte razd = (byte)razdelitel;
        Triangle triangleNew;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );

        for (int i=0; i<storage.getStorage().size(); ++i){
            triangleNew=storage.getStorageByIndex(i);
            dots[0]=triangleNew.getLine1();
            dotsByte[0] = (byte) dots[0];
            dots[1]=triangleNew.getLine2();
            dotsByte[1] = (byte)dots[1];
            dots[2]=triangleNew.getLine3();;
            dotsByte[2] = (byte)dots[2];

            outputStream.write( dotsByte[0] );
            //outputStream.write( razd );
            outputStream.write( dotsByte[1] );
            //outputStream.write( razd );
            outputStream.write( dotsByte[2] );
            //outputStream.write( razd );
        }
        bytesToWrite = outputStream.toByteArray( );
        outFile = null;
        boolean isOpened = false;
        try {
            outFile = new FileOutputStream(fileWay, false);
            isOpened = true;
            outFile.write(bytesToWrite); //запись в файл
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести запись в файл:" + fileWay);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода:" + e);
        }
        if (isOpened) {
            outFile.close();
        }
        System.out.println("Saving END***************");

    }

    public void Load(String fileWay) throws IOException {
        System.out.println("Loading triangle information:");
        //Storage storage = new Storage();
        byte[] wert = new byte[0];
        int amount=0;
        byte[] bytesReaded;
        try {

            inFile = new FileInputStream(fileWay);
            int bytesAvailable = inFile.available(); //сколько можно считать
            System.out.println("Available: " + bytesAvailable);

            bytesReaded = new byte[bytesAvailable]; //куда считываем
            int count = inFile.read(bytesReaded, 0, bytesAvailable);

            System.out.println("Было считано байт: " + count);
            System.out.println(Arrays.toString(bytesReaded));
            wert = bytesReaded.clone();
            amount = count;
            inFile.close();

        }catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести чтение из файла:" + fileWay);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода:" + e);
        }
        byte[] dannie=wert.clone();

        byte[] tochki = new byte[amount];
        int[] tochkiInt = new int[amount];
        int q = 0, g1=0;
        Storage storage = new Storage();
        int eachThree=0;
        for (int i = 0; i < amount; i++) {
            tochkiInt [i] = (int)dannie[i];
            eachThree++;
            if (eachThree%3==0){
                eachThree=0;
                storage.add(new Triangle(tochkiInt[i-2], tochkiInt[i-1], tochkiInt[i]));
            }

            /*
            for (int g=(0+i*3); g<3; g++) {
                tochki [g] = dannie[g];
                g1=g-2;
            }
            int[] tochkiDouble= new int[3];
            tochkiDouble[0]=(int) tochki[g1];
            tochkiDouble[1]=(int) tochki[g1+1];
            tochkiDouble[2]=(int) tochki[g1+2];

            storage.add(new Triangle(tochkiDouble[0], tochkiDouble[1], tochkiDouble[2]));


             */
        }

        storage.getInfo();
        System.out.println("Loading triangle information END");
        inFile.close();

    }

}

