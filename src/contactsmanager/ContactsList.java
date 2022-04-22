package contactsmanager;

import java.util.HashMap;

public class ContactsList {

    public static void putContacts() {

        /* CREATE NEW HASHMAP */
        HashMap<String, String> contactsInfo = new HashMap<>();

        /* PUT AND GET FROM HASHMAP */
        contactsInfo.put(Input.getUserName("Please enter contact name: "), Input.getUserPhoneNumber("Please enter contact phone number: "));
        System.out.println(contactsInfo);

    }
}
