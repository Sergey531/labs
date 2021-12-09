package Labs.lab4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Storage implements Serializable {
    private List<Triangle> storage;

    public Storage(int M, int N){
        int a, b, c;
        storage = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            do {
                a = (int) (Math.random() * 10);
                b = (int) (Math.random() * 10);
                c = (int) (Math.random() * 10);
            }
            while (!Triangle.isTriangle(a, b, c));
            Triangle triangle = new Triangle(a, b, c);
            storage.add(triangle);
            System.out.println(triangle);
        }
        System.out.println();
        System.out.println("Average area of M triangles: " + getAverageArea());
        System.out.println();

        //*************************************

        for (int i = 0; i < N; i++){
            do {
                a = (int) (Math.random() * 10);
                b = (int) (Math.random() * 10);
                c = (int) (Math.random() * 10);
            }
            while (!RightTriangle.isRightTriangle(a, b, c));
            RightTriangle rightTriangle = new RightTriangle(a, b, c);
            storage.add(rightTriangle);
            System.out.println(rightTriangle);
        }
        System.out.println();
        System.out.println("Max hypotenuse of N rightTriangles: " + getMaxHypotenuse());
        System.out.println();
    }
    public Storage(){
        storage = new ArrayList<>();
    }
    public Storage(List<Triangle> storage1){
        storage = new ArrayList<>();
        this.storage = storage1;
    }

    public List<Triangle> getList(){
        return storage;
    }

    public void add(Triangle triangle){
        storage.add(triangle);
    }
    public void add(RightTriangle rightTriangle){
        storage.add(rightTriangle);
    }

    public ArrayList<Triangle> getStorage(){
        return (ArrayList<Triangle>)storage;
    }

    public Triangle getStorageByIndex(int i){
        return storage.get(i);
    }

    public void getInfo(){
        for (int i = 0; i < storage.size(); i++) {
            System.out.println(storage.get(i).toString());
        }
    }

    public double getAverageArea(){
        double averageArea=0;
        for (int i = 0; i < storage.size(); i++) {
            averageArea = averageArea+storage.get(i).getArea();
        }
        averageArea=averageArea/storage.size();
        return averageArea;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storage=" + storage +
                '}';
    }

    public int getMaxHypotenuse(){
        int hypotenuse = 0;
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).isRightTriangle()){
                RightTriangle rightTriangle = new RightTriangle(storage.get(i).getLine1(), storage.get(i).getLine2(), storage.get(i).getLine3());
                if(hypotenuse<rightTriangle.getHypotenuse()){
                    hypotenuse= rightTriangle.getHypotenuse();
                }
            }
        }
        return hypotenuse;
    }

    public void setList(ArrayList<Triangle> list){
        this.storage = list;
    }
}
