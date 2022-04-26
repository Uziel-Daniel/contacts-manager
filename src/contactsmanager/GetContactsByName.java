package contactsmanager;

import java.util.HashMap;

public class GetContactsByName {


    public static boolean getContactsInfoByName() {

        //    gets the contacts object
        HashMap<Integer, ContactObject> contactsInfo = ContactsList.getContactsInfo();
        String findContactByName = Input.getUserName("Enter a contact name to begin searching: ");

//        iterate over the object to find a specific name entered by the user
        for (int key : contactsInfo.keySet()) {
//            we iterate over all the keys to find if any key contains the values from the string findContactByname
            if (contactsInfo.get(key).getName().contains(findContactByName)) {

//        if its there... print the name and contact info
                System.out.println("Found user: " + contactsInfo.get(key).getName() + " at ID #" + key);
                return true;

//                We can't use an else statement because as the iteration is ocurring, it will go through the else statement
//                We can exit the method, print out an statement to look again and from there decide whether or not call the method again
            }
        }
        return false;
    }
}

