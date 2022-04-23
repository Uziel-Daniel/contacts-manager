package contactsmanager;

import java.util.HashMap;

public class GetContactsByName {

    public void GetContactsInfoByName() {
        HashMap<Integer, ContactObject> contactsInfo = ContactsList.getContactsInfo();
//        System.out.println(contactsInfo.values().iterator().next().getName().contains("uziel"));
        for (int key : contactsInfo.keySet()) {
            if (contactsInfo.get(key).getName().contains("uziel")){
                System.out.println(contactsInfo.get(key).getName() + "found it");
            }
        }
    }
}

