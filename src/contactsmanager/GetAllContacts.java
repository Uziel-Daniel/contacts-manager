package contactsmanager;

import java.util.HashMap;

public class GetAllContacts {


//    prints all objects with their contact name and contact phone number
    public static void getAllContacts(){
        HashMap<Integer, ContactObject> contactsInfo = ContactsList.getContactsInfo();

        System.out.println("========================================================================");
        System.out.printf("%1s %45s %10s%n", "| Name", "|", " Phone Number     |");
        System.out.println("========================================================================");

        for (int key : contactsInfo.keySet()) {
            System.out.printf("%-50s %-4s %1s%n", contactsInfo.get(key).getName(), "|", contactsInfo.get(key).getPhoneNumber());
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
