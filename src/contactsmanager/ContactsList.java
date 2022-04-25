package contactsmanager;

import java.util.Arrays;
import java.util.HashMap;

public class ContactsList {

    /* CREATE NEW HASHMAP */
    static HashMap<Integer, ContactObject> contactsInfo = new HashMap<>();


    public static void putContacts() {

        ContactObject contact = new ContactObject();

        contact.setName(Input.getUserName("Please enter a contact name: "));
        contact.setPhoneNumber(Input.getUserName("Please enter a contact phone number: "));

        int maxKey = contactsInfo.keySet().stream().max(Integer::compareTo).orElse(0);
        contactsInfo.put(maxKey + 1, contact);
    }

    //returns the hash map with all objects so that we can use it in the GetAllContacts class
    public static HashMap<Integer, ContactObject> getContactsInfo() {
        return contactsInfo;
    }
}
