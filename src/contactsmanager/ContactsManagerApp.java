package contactsmanager;

import static contactsmanager.Input.getUserChoice;
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


//        /////////////////////////////////////////  print all contacts
//        call GetAllContacts to see all contacts info
        System.out.println("see all contacts");
//        GetAllContacts getAllContacts = new GetAllContacts();

        GetAllContacts.GetAllContacts();


//        /////////////////////////////////////////// search by name /////////////////////////////////////
//        print contacts object based on input search... search for specific name within the hashmap
        System.out.println("see all contacts by name");
        GetContactsByName getContactsByName = new GetContactsByName();
        getContactsByName.GetContactsInfoByName();

//        if no contact was found... we can recall the method to search again
//        System.out.println("no user was found");
//        getContactsByName.GetContactsInfoByName();


        EditContactInfo.editContactInfo();


        System.out.println("see all contacts");
        GetAllContacts.GetAllContacts();

        ChoicesRunner.choices();

        System.out.println("Would you like to delete ");

        /* DELETE DO WHILE FLAG */
        String userChoice2;
        userChoice2 = getUserChoice("Do you want to delete any contacts? y/n");

        do {
            ContactsList.deleteContact();
            userChoice2 = getUserChoice("Do you want to delete any contacts? y/n");

        } while(userChoice2.equalsIgnoreCase("y"));



    }
}
