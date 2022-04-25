package contactsmanager;

import com.google.gson.Gson;

import java.io.IOError;
import java.nio.file.Path;
import java.util.HashMap;

public class WriteFiles {
    public static void writeFiles(Path filePath, HashMap<Integer, ContactObject> contactsInfo) {
        try {
            String contactStr = new Gson().toJson(contactsInfo);

        }catch (IOError e){
            System.out.println(e.getMessage());

        }

    }

//    public static HashMap<Integer, ContactObject> contactsInfo
}
