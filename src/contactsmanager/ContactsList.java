package contactsmanager;

import java.util.HashMap;

public class ContactsList {

    /* CREATE NEW HASHMAP */
    static HashMap<Integer, ContactObject> contactsInfo = new HashMap<>();

    /* ADD CONTACTS */
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

    /* DELETE CONTACTS */
    public static void deleteContact() {
        //    gets the contacts object
        String findContactByName = Input.getUserName("enter contact to be deleted");

//        iterate over the object to find a specific name entered by the user
        for (int key : contactsInfo.keySet()) {

//            we iterate over all the keys to find if any key contains the values from the string findContactByname
            if (contactsInfo.get(key).getName().contains(findContactByName)) {

                contactsInfo.remove(key);
                System.out.println("Deleted Contact: " + findContactByName);
                return;
            }
        }

    }
}
