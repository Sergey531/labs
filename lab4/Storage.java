package Labs.lab4;

import Labs.lab4.RightTriangle;
import Labs.lab4.Triangle;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Triangle> storage = new ArrayList<>();

    public Storage(){

    }
    public void add(Triangle triangle){
        storage.add(triangle);
    }
    public void add(RightTriangle rightTriangle){
        storage.add(rightTriangle);
    }

    public ArrayList<Triangle> getStorage(){
        return storage;
    }

    public Triangle getStorageByIndex(int i){
        return storage.get(i);
    }

    public void getInfo(){
        for (int i = 0; i < storage.size(); i++) {
            System.out.println(storage.get(i).toString());
        }
    }

}
