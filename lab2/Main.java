package Labs.lab2;

public class Main {
    public static void main(String[] args) {
        int M=10, N=5, M1=0;
        double Saverage =0;
        //Triangle triangle1 = new Triangle(3, 4, 5);
        //System.out.println(triangle1.toString());
        for (int i = 0; i < M; i++) {
            Triangle triangle = new Triangle((int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*10));
            Saverage = Saverage + triangle.getArea();
            if (triangle.getArea()==0){
                M1++;
            }
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
            if (rightTriangle.getHypotenuse()>Hypotenuse){
                Hypotenuse=rightTriangle.getHypotenuse();
            }
            System.out.println(rightTriangle);
        }
        System.out.println();
        System.out.println("Max hypotenuseSize: "+Hypotenuse);
        System.out.println();
    }

}
