package contactsmanager;

import java.util.HashMap;

public class ContactsList {

    public static void putContacts(String contactName, String phoneNumber) {

        HashMap<String, String> contactsInfo = new HashMap<>();
        contactsInfo.put(contactName, phoneNumber);
        ContactsList contactsList = new ContactsList();
        contactsList.putContacts("tets", "123313133");

        System.out.println(contactsList);
    }

//     public ContactsList(){};
//
//
//    public HashMap<String, String> getContactsInfo() {
//        return contactsInfo;
//    }
//
//    public void setContactsInfo(String nameContact, String phoneNumber) {
//        contactsInfo.put(nameContact, phoneNumber);
//        this.contactsInfo = contactsInfo;
//    }

}
