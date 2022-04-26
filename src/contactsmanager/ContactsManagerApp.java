package contactsmanager;

public class ContactsManagerApp {

    public static void main(String[] args) {

        ChoicesRunner.choices();
//        gets directory path and sends getContactInfo to that path
        WriteFiles.writeFiles(WriteFiles.tryMakeFileDirectory(), ContactsList.getContactsInfo());

    }
}
