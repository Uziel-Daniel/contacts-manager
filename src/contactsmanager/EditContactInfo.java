package contactsmanager;

import java.util.HashMap;

public class EditContactInfo {
    public EditContactInfo() {

        //    gets the contacts object
        HashMap<Integer, ContactObject> contactsInfo = ContactsList.getContactsInfo();
        String findContactByName = Input.getUserName("enter contact to be edited");

//        iterate over the object to find a specific name entered by the user
        for (int key : contactsInfo.keySet()) {
//            we iterate over all the keys to find if any key contains the values from the string findContactByname
            if (contactsInfo.get(key).getName().contains(findContactByName)) {

//        if its there... print the name and contact info
                contactsInfo.get(key).setName(Input.getUserName("enter new name"));

                System.out.println("edit successful");

                if (Input.getUserName("would you like to edit the phone number as well? y/n").equalsIgnoreCase("y")) {

                    contactsInfo.get(key).setPhoneNumber(Input.getUserPhoneNumber("enter new phone number"));

                }

            }
        }


    }
}
