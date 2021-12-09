package Labs.lab4;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialize {
    private List<Triangle> db;
    public void serializeStorage(Storage storage, String fileWay) throws IOException {
        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream(fileWay);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(storage);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }

    public Storage deSerializeStorage(String fileWay) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileWay);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Storage storage = (Storage) objectInputStream.readObject();
        return storage;
    }

    public void jacksonSerialize(String fileName, Storage storage) throws IOException {
        ObjectMapper objectMapperList = new ObjectMapper();
        setList(storage);
        objectMapperList.writeValue(new File(fileName), storage);
    }

    public List<Triangle> getList(){
        return  this.db;
    }

    public void setList(Storage storage){
        this.db = storage.getList();
    }


    public List<Triangle> jacksonDeserialize(String fileName) throws IOException {
        ObjectMapper objectMapperList = new ObjectMapper();
        Storage storage = new Storage();
        objectMapperList.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        storage = objectMapperList.readValue(new File(fileName), Storage.class);
        //this.db = storage.getList();
        return storage.getList();
        //return storage;
    }
}
