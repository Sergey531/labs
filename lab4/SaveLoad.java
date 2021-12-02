package Labs.lab4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class SaveLoad {
    private static FileOutputStream outFile;
    private static FileInputStream inFile;

    public void Save(Storage storage , String fileWay)throws IOException{
        byte[] bytesToWrite;
        double[] dots= new double[8];
        byte[] dotsByte = new byte[8];
        char razdelitel = '.';
        byte razd = (byte)razdelitel;
        Triangle triangleNew;

        for (int i=0; i<storage.getStorage().size(); ++i){
            triangleNew=storage.getStorageByIndex(i);
            dots[0]=triangleNew.getLine1();
            dotsByte[0] = (byte)dots[0];
            dots[1]=triangleNew.getLine2();
            dotsByte[1] = (byte)dots[1];
            dots[2]=triangleNew.getLine3();;
            dotsByte[2] = (byte)dots[2];
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );
        outputStream.write( dotsByte[0] );
        outputStream.write( razd );
        outputStream.write( dotsByte[1] );
        outputStream.write( razd );
        outputStream.write( dotsByte[2] );
        outputStream.write( razd );


        bytesToWrite = outputStream.toByteArray( );
        outFile = null;
        boolean isOpened = false;
        try {
            outFile = new FileOutputStream(fileWay, true);
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
    }

    public void Load(String fileWay) throws IOException {
        Storage storage = new Storage();
        byte[] wert=new byte[0];
        int amount=0;
        try {

            inFile = new FileInputStream(fileWay);
            int bytesAvailable = inFile.available(); //сколько можно считать
            System.out.println("Available: " + bytesAvailable);

            byte[] bytesReaded = new byte[bytesAvailable]; //куда считываем
            int count = inFile.read(bytesReaded, 0, bytesAvailable);

            System.out.println("Было считано байт: " + count);
            System.out.println(Arrays.toString(bytesReaded));
            byte[] trap = bytesReaded;
            wert=trap;
            amount = count;
            inFile.close();

        }catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести чтение из файла:" + fileWay);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода:" + e);
        }
        byte[] dannie=wert;

        int month=0;

        byte[] tochki = new byte[8];
        int q = 0;
        for (int i = 0; i < amount; i++) {
            //System.out.println("i = "+i);
            for (int g=0; g<3; g++) {
                if (dannie[i] == 46) {
                    q = i+1;
                    break;
                }
                tochki [g] = dannie[i+g];
            }
            int[] tochkiDouble= new int[8];
            tochkiDouble[0]=(int) tochki[0];
            tochkiDouble[1]=(int) tochki[1];
            tochkiDouble[2]=(int) tochki[2];

            Triangle triangle = new Triangle(tochkiDouble[0], tochkiDouble[1], tochkiDouble[2]);
            storage.add(triangle);
            System.out.println("Loading triangle information:");
            System.out.println(triangle.toString());
            System.out.println("Loading triangle information END");
            i-=1;
            if(i==amount-1)
            {
                break;
            }

            if (i==-1){
                break;
            }



        }
        inFile.close();

    }

}

