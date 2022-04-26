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
                    "   /  \033[1;31m/XXXXXXXXXXX\\    /XXXXXXXXXXX\\ \033[0;97m  \\" + " " + "    |  1. View Contacts                |" + "\n" +
                    "  /  \033[1;31m/############/    \\############\\ \033[0;97m \\" + " " + "    |  2. Add New Contact              |" + "\n" +
                    "  |  \033[1;31m\\XXXXXXXXXXX/ _  _ \\XXXXXXXXXXX/ \033[0;97m  |" + " " + "   |  3. Edit Contact                 |" + "\n" +
                    "__|\\_____   ___   //  \\\\   ___   _____/|__" + " " + "  |  4. Search a Contact by Name     |" + "\n" +
                    "[_       \\     \\  X    X  /     /       _]" + " " + "  |  5. Delete an Existing Contact   |" + "\n" +
                    "__|     \\ \\                    / /     |__" + " " + "  |  6. Exit                         |" + "\n" +
                    "[____  \\ \\ \\   ____________   / / /  ____]" + " " + "  ------------------------------------" + "\n" +
                    "     \\  \\ \\ \\/||.||.||.||.||\\/ / /  /\n" +
                    "      \\_ \\ \\  ||.||.||.||.||  / / _/\n" +
                    "        \\ \\   ||.||.||.||.||   / /\n" +
                    "         \\_   ||_||_||_||_||   _/\n" +
                    "           \\     ........     /\n" +
                    "            \\________________/ \n"
            );
            userChoice = Integer.parseInt(Input.getUserName("\033[0;97mEnter an option (1, 2, 3, 4 or 5): "));

            if (userChoice == 1) {
                System.out.println("Option 1: \n");

                GetAllContacts.getAllContacts();

            } else if (userChoice == 2) {
                System.out.println("Option 2: \n");

                /* DO WHILE FLAG */
                String keepAdding = Input.getUserName("Do you want to add any contacts? y/n: ");

                /* INITIALIZING CONTACT HASHMAP POPULATING */
                do {
                    ContactsList.putContacts();

                    keepAdding = getUserName("\033[0;97mDo you want to keep adding any contacts? y/n: ");

                } while (keepAdding.equalsIgnoreCase("Y"));

            } else if (userChoice == 3) {
                System.out.println("Option 3: \n");
                EditContactInfo.editContactInfo();


            } else if (userChoice == 4) {
                System.out.println("Option 4: \n");

                System.out.println("\u001b[32m- Searching for a contact by name -\u001b[0m");

                GetContactsByName.getContactsInfoByName();


            } else if (userChoice == 5) {
                System.out.println("Option 5: \n");

                /* DELETE DO WHILE FLAG */
                String deleteContact = getUserChoice("Do you want to delete any contacts? y/n");

                do {
                    ContactsList.deleteContact();
                    deleteContact = getUserChoice("Are you sure you want to select a contact to delete? y/n");

                } while(deleteContact.equalsIgnoreCase("y"));

            } else if (userChoice == 6) {
                System.out.println("Option 5, Exiting the Program...");

            }

            if (Input.getUserName("Do you want to continue using the app? y/n: ").equalsIgnoreCase("y")){
                keepRunningApp = true;

            } else{
                keepRunningApp = false;
            }

        } while (keepRunningApp);
    }
}
