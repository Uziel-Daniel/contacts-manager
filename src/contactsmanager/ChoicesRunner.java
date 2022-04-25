package contactsmanager;

public class ChoicesRunner {

    public static void choices() {
        boolean keepRunningApp = false;
        int userChoice;

        do {
            System.out.println(" 1. View Contacts \n 2. Add New Contact \n " +
                    "3. Search a Contact by Name \n 4. Delete an Existing Contact \n" +
                    " 5. Exit \n "
            );
            userChoice = Integer.parseInt(Input.getUserPhoneNumber("Enter an option (1, 2, 3, 4 or 5):"));
            if (userChoice == 1) {
                System.out.println("chooose 1");

            } else if (userChoice == 2) {
                System.out.println("choose2");
            } else if (userChoice == 3) {
                System.out.println("choose 3");
            } else if (userChoice == 4) {
                System.out.println("choose 4");
            } else if (userChoice == 5) {
                System.out.println("choose 5");
            } else if (userChoice == 0) {
                System.out.println("choose 0");
            }

        } while (keepRunningApp);

    }
}
