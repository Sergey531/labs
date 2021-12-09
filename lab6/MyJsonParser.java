package Labs.lab6;

import javax.json.Json;
import javax.json.stream.JsonParser;
import java.io.StringReader;

public class MyJsonParser {

    public void jsonParser(String jsonData){
        JsonParser parser = Json.createParser(new StringReader(jsonData));
        while (parser.hasNext()) {
            JsonParser.Event event = parser.next();
            switch(event) {
                case START_ARRAY:
                case END_ARRAY:
                case START_OBJECT:
                case END_OBJECT:
                case VALUE_FALSE:
                case VALUE_NULL:
                case VALUE_TRUE:
                    System.out.println(event.toString());
                    break;
                case KEY_NAME:
                    System.out.print(event.toString() + " " +
                            parser.getString() + " - ");
                    break;
                case VALUE_STRING:
                case VALUE_NUMBER:
                    System.out.println(event.toString() + " " +
                            parser.getString());
                    break;
            }
        }
    }
}
