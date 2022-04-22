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
    }
}
