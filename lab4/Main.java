package Labs.lab4;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileWay = "C:\\Users\\serge\\Desktop\\SaveFile.bin";
        String fileWay2 = "C:\\Users\\serge\\Desktop\\SaveFile.ser";
        String fileWay3 = "C:\\Users\\serge\\Desktop\\SaveFileJackson.json";

        int M = 10, N = 5;
        Storage storage = new Storage(M, N);
        SaveLoad saveLoad = new SaveLoad();
        Serialize serialize = new Serialize();


        saveLoad.Save(storage, fileWay);
        saveLoad.Load(fileWay);

        serialize.serializeStorage(storage, fileWay2);
        serialize.deSerializeStorage(fileWay2);



        serialize.jacksonSerialize(fileWay3, storage);
        storage.setList((ArrayList<Triangle>) serialize.jacksonDeserialize(fileWay3));
        System.out.println("**************************");
        System.out.println(storage.toString());
    }
}

