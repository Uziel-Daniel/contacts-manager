package contactsmanager;

import static contactsmanager.Input.getUserName;

public class ContactsManagerApp {

    public static void main(String[] args) {

        /* DO WHILE FLAG */
        String userChoice;
        userChoice = getUserName("Do you want to add any contacts? y/n");

        /* INITIALIZING CONTACT HASHMAP POPULATING */
        do {
            ContactsList.putContacts();

            userChoice = getUserName("Do you want to keep adding any contacts? y/n");

        } while (userChoice.equalsIgnoreCase("Y"));


//        call GetAllContacts to see all contacts info
        System.out.println("see all contacts");
        GetAllContacts getAllContacts = new GetAllContacts();



//        print contacts object based on input search... search for specific name within the hashmap
        System.out.println("see all contacts by name");
        GetContactsByName getContactsByName = new GetContactsByName();
        getContactsByName.GetContactsInfoByName();

    }
}
