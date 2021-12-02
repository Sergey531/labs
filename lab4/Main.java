package Labs.lab4;

import Labs.lab4.RightTriangle;
import Labs.lab4.Storage;
import Labs.lab4.Triangle;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileWay = "C:\\\\Users\\\\serge\\\\Desktop\\\\saveFile.bin";

        SaveLoad saveLoad1 = new SaveLoad();
        saveLoad1.Load(fileWay);

        int M=10, N=5, M1=0;
        double Saverage =0;
        //Triangle triangle1 = new Triangle(3, 4, 5);
        //System.out.println(triangle1.toString());
        Storage storage = new Storage();
        for (int i = 0; i < M; i++) {
            Triangle triangle = new Triangle((int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*10));
            Saverage = Saverage + triangle.getArea();
            if (triangle.getArea()==0){
                M1++;
            }
            else storage.add(triangle);

            System.out.println(triangle);
        }
        Saverage = Saverage/(M-M1);
        System.out.println();
        System.out.println("Average area of M triangles: "+Saverage);
        System.out.println();

        int Hypotenuse = 0;
        for (int i = 0; i < N; i++) {
            int a=(int)(Math.random()*10);
            //int b= 4*(int)(Math.random()*10);
            RightTriangle rightTriangle = new RightTriangle(3*a, 4*a, 5*a);
            storage.add(rightTriangle);
            if (rightTriangle.getHypotenuse()>Hypotenuse){
                Hypotenuse=rightTriangle.getHypotenuse();
            }
            System.out.println(rightTriangle);
        }
        System.out.println();
        System.out.println("Max hypotenuseSize: "+Hypotenuse);
        System.out.println();
        System.out.println("******************");
        storage.getInfo();

        SaveLoad saveLoad = new SaveLoad();
        saveLoad.Save(storage, fileWay);
    }





}