package contactsmanager;

import static contactsmanager.Input.getUserChoice;
import static contactsmanager.Input.getUserName;

public class ChoicesRunner {

    public static void choices() {
        boolean keepRunningApp = true;
        int userChoice;

        do {
            System.out.println(" 1. View Contacts \n 2. Add New Contact \n " +
                    "3. Search a Contact by Name \n 4. Delete an Existing Contact \n" +
                    " 5. Exit \n 6. Edit contact "
            );
            userChoice = Integer.parseInt(Input.getUserPhoneNumber("Enter an option (1, 2, 3, 4 or 5):"));
            if (userChoice == 1) {
                System.out.println("chooose 1");
                GetAllContacts.getAllContacts();

            } else if (userChoice == 2) {
                System.out.println("choose2");
                /* DO WHILE FLAG */
                String keepAdding = Input.getUserName("Do you want to add any contacts? y/n");

                /* INITIALIZING CONTACT HASHMAP POPULATING */
                do {
                    ContactsList.putContacts();

                    keepAdding = getUserName("Do you want to keep adding any contacts? y/n");

                } while (keepAdding.equalsIgnoreCase("Y"));
            } else if (userChoice == 3) {
                System.out.println("choose 3");
                System.out.println("see all contacts by name");
                GetContactsByName.getContactsInfoByName();
            } else if (userChoice == 4) {
                System.out.println("choose 4");
                /* DELETE DO WHILE FLAG */
                String deleteContact = getUserChoice("Do you want to delete any contacts? y/n");

                do {
                    ContactsList.deleteContact();
                    deleteContact = getUserChoice("Do you want to delete any contacts? y/n");

                } while(deleteContact.equalsIgnoreCase("y"));
            } else if (userChoice == 5) {
                System.out.println("choose 5");
            } else if (userChoice == 6) {
                System.out.println("choose to edit a contact");

                EditContactInfo.editContactInfo();

            }
            if (Input.getUserName("do you want to keep using the app?").equalsIgnoreCase("y")){
                keepRunningApp = true;
            } else{
                keepRunningApp = false;
            }

        } while (keepRunningApp);





    }
}
