package contactsmanager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class WriteFiles {

        public static Path tryMakeFileDirectory(){
        String directory = "data";
        String filename = "info.json";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        try{
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (! Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            return dataFile;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void writeFiles(Path filePath, HashMap<Integer, ContactObject> contactsListHashMap) {
        try {
            String contactStr = new Gson().toJson(contactsListHashMap);
            Files.write(filePath, Stream.of(contactStr).toList());

        }catch (IOError e){
            System.out.println(e.getMessage());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    working on it

    public static HashMap<Integer, ContactObject> tryReadFile(Path filePath){

        try {
            Type typeToken = new TypeToken<Map<Integer, ContactObject>> () {}.getType();
            return new Gson().fromJson(Files.readAllLines(filePath).get(0), typeToken);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
