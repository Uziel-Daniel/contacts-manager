package contactsmanager;

import java.util.HashMap;
import static contactsmanager.Input.testName;

public class ContactsList {

    static HashMap<String, String> contactsInfo = new HashMap<>();

    public static void putContacts() {

        /* CREATE NEW HASHMAP */

        String testName = testName("test");


        /* PUT AND GET FROM HASHMAP */
        contactsInfo.put(Input.getUserName("Please enter contact name: "), Input.getUserPhoneNumber("Please enter contact phone number: "));
        System.out.println(contactsInfo);

    }
}
