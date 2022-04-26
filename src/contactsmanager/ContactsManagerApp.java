package contactsmanager;

public class ContactsManagerApp {

    public static void main(String[] args) {

//        creates directory and file
        System.out.println(WriteFiles.tryMakeFileDirectory());

        ChoicesRunner.choices();
//        gets directory path and sends getContactInfo to that path
        WriteFiles.writeFiles(WriteFiles.tryMakeFileDirectory(), ContactsList.getContactsInfo());

//        READS FROM FILE JSON
//        System.out.println(WriteFiles.tryReadFile(WriteFiles.tryMakeFileDirectory()));
    }
}
