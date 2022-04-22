package contactsmanager;

import java.util.HashMap;

public class GetAllContacts {


//    prints all objects with their contact name and contact phone number
    public GetAllContacts(){
        HashMap<Integer, ContactObject> contactsInfo = ContactsList.getContactsInfo();
        for (int key : contactsInfo.keySet()) {

//            needs to fixed so that input displays correctly
//            prints everything correctly but without good format
            System.out.println(contactsInfo.get(key).getName() + " | " + contactsInfo.get(key).getPhoneNumber());


        }
    }
}
