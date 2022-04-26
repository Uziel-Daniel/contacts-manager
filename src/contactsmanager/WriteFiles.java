package contactsmanager;

import com.google.gson.Gson;

import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
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

//    public static List<ContactsList> tryReadFile(Path filePath){
//
//        try {
//            return Stream
//                    .of(new Gson().fromJson(Files.readAllLines(filePath).get(0), ContactsList.class))
//                    .toList();
//        }catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        return null;
//    }
}
