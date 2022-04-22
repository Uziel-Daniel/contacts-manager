package contactsmanager;

import java.util.Arrays;
import java.util.HashMap;

public class ContactsList {

    /* CREATE NEW HASHMAP */
    static HashMap<Integer, ContactObject> contactsInfo = new HashMap<>();

    static int counter = 0;
    public static void putContacts() {

        ContactObject contact = new ContactObject();

        contact.setName(Input.getUserName("Please enter a contact name: "));
        contact.setPhoneNumber(Input.getUserName("Please enter a contact phone number: "));

        /* PUT AND GET FROM HASHMAP */
        System.out.println(contact.getName() + contact.getPhoneNumber() + " object");
        contactsInfo.put(counter, contact);
        for (int key: contactsInfo.keySet()){
            System.out.print(key + "    |    ");
//            System.out.println(contactsInfo.get(key));

            System.out.println(contactsInfo.get(key).getName());

            System.out.println(contactsInfo.get(key).getPhoneNumber());

        }


        counter += 1;
    }
}
