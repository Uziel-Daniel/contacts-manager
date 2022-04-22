package contactsmanager;

import java.util.HashMap;

public class ContactsList {

    /* CREATE NEW HASHMAP */
    static HashMap<Integer, ContactObject> contactsInfo = new HashMap<>();

    public static void putContacts() {

        int counter = 0;

        ContactObject contact = new ContactObject();

        contact.setName(Input.getUserName("Please enter a contact name: "));
        contact.setPhoneNumber(Input.getUserName("Please enter a contact phone number: "));

        /* PUT AND GET FROM HASHMAP */
        contactsInfo.put(counter, contact);
        System.out.println(contactsInfo);

        counter += 1;
    }
}
