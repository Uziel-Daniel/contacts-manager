package contactsmanager;

import java.util.HashMap;

public class EditContactInfo {
    public static void editContactInfo() {

        //    gets the contacts object
        HashMap<Integer, ContactObject> contactsInfo = ContactsList.getContactsInfo();
        String findContactByName = Input.getUserName("Enter a contact name to edit the entry: ");

//        iterate over the object to find a specific name entered by the user
        for (int key : contactsInfo.keySet()) {
//            we iterate over all the keys to find if any key contains the values from the string findContactByname
            if (contactsInfo.get(key).getName().contains(findContactByName)) {

//        if its there... print the name and contact info
                contactsInfo.get(key).setName(Input.getUserName("Please enter a new name: "));

                System.out.println("\u001b[32m- Edit Successful -\u001b[0m");

                if (Input.getUserName("would you like to edit the phone number as well? y/n").equalsIgnoreCase("y")) {

                    contactsInfo.get(key).setPhoneNumber(Input.getUserPhoneNumber("enter new phone number"));

                }

            }
        }


    }
}
