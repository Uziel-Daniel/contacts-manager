package contactsmanager;

import static contactsmanager.Input.getUserChoice;
import static contactsmanager.Input.getUserName;

public class ChoicesRunner {

    public static void choices() {
        boolean keepRunningApp = true;
        int userChoice;

        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "                __________\n" +
                    "         ______/ ________ \\______\n" +
                    "       _/      ____________      \\_\n" +
                    "     _/____________    ____________\\_\n" +
                    "    /  ___________ \\  / ___________  \\" + " " + "      ------------------------------------" + "\n" +
                    "   /  /XXXXXXXXXXX\\ \\/ /XXXXXXXXXXX\\  \\" + " " + "     |  1. View Contacts                |" + "\n" +
                    "  /  /############/    \\############\\  \\" + " " + "    |  2. Add New Contact              |" + "\n" +
                    "  |  \\XXXXXXXXXXX/ _  _ \\XXXXXXXXXXX/  |" + " " + "    |  3. Search a Contact by Name     |" + "\n" +
                    "__|\\_____   ___   //  \\\\   ___   _____/|__" + " " + "  |  4. Delete an Existing Contact   |" + "\n" +
                    "[_       \\     \\  X    X  /     /       _]" + " " + "  |  5. Exit                         |" + "\n" +
                    "__|     \\ \\                    / /     |__" + " " + "  |  6. Edit contact                 |" + "\n" +
                    "[____  \\ \\ \\   ____________   / / /  ____]" + " " + "  ------------------------------------" + "\n" +
                    "     \\  \\ \\ \\/||.||.||.||.||\\/ / /  /\n" +
                    "      \\_ \\ \\  ||.||.||.||.||  / / _/\n" +
                    "        \\ \\   ||.||.||.||.||   / /\n" +
                    "         \\_   ||_||_||_||_||   _/\n" +
                    "           \\     ........     /\n" +
                    "            \\________________/ \n"
            );

            userChoice = Integer.parseInt(Input.getUserPhoneNumber("Enter an option (1, 2, 3, 4 or 5):"));

            if (userChoice == 1) {
                System.out.println("Option 1: \n");

                GetAllContacts.getAllContacts();

            } else if (userChoice == 2) {
                System.out.println("Option 2: \n");

                /* DO WHILE FLAG */
                String keepAdding = Input.getUserName("Do you want to add any contacts? y/n");

                /* INITIALIZING CONTACT HASHMAP POPULATING */
                do {
                    ContactsList.putContacts();

                    keepAdding = getUserName("Do you want to keep adding any contacts? y/n");

                } while (keepAdding.equalsIgnoreCase("Y"));

            } else if (userChoice == 3) {
                System.out.println("Option 3: \n");

                System.out.println("Search all contacts by name: ");

                GetContactsByName.getContactsInfoByName();

            } else if (userChoice == 4) {
                System.out.println("Option 4: \n");

                /* DELETE DO WHILE FLAG */
                String deleteContact = getUserChoice("Do you want to delete any contacts? y/n");

                do {
                    ContactsList.deleteContact();
                    deleteContact = getUserChoice("Are you sure you want to select a contact to delete? y/n");

                } while(deleteContact.equalsIgnoreCase("y"));

            } else if (userChoice == 5) {
                System.out.println("Option 5, Exiting the Program...");

            } else if (userChoice == 6) {
                System.out.println("Option 6: \n");
                EditContactInfo.editContactInfo();

            }

            if (Input.getUserName("Do you want to continue using the app? y/n: ").equalsIgnoreCase("y")){
                keepRunningApp = true;

            } else{
                keepRunningApp = false;
            }

        } while (keepRunningApp);
    }
}
