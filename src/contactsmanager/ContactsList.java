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
        counter += 1;
    }

    //returns the hash map with all objects so that we can use it in the GetAllContacts class
    public static HashMap<Integer, ContactObject> getContactsInfo() {
        return contactsInfo;
    }

    /* DELETE CONTACTS */
    public static void deleteContact() {
        //    gets the contacts object
        HashMap<Integer, ContactObject> contactsInfo = ContactsList.getContactsInfo();

        String findContactByName = Input.getUserName("enter contact to be deleted");

//        iterate over the object to find a specific name entered by the user
        for (int key : contactsInfo.keySet()) {
//            we iterate over all the keys to find if any key contains the values from the string findContactByname
            if (contactsInfo.get(key).getName().contains(findContactByName)) {

//        if its there... print the name and contact info
                contactsInfo.remove(key);

//                System.out.println(contactsInfo.get(key).getName() + " found user input");

//                We can't use an else statement because as the iteration is ocurring, it will go through the else statement
//                We can exit the method, print out an statement to look again and from there decide whether or not call the method again
            }
        }

    }
}
