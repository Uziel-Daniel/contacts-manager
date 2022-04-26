package contactsmanager;

public class ContactsManagerApp {

    public static void main(String[] args) {

        System.out.println(WriteFiles.tryMakeFileDirectory());

        ChoicesRunner.choices();
        WriteFiles.writeFiles(WriteFiles.tryMakeFileDirectory(), ContactsList.getContactsInfo());

        System.out.println(WriteFiles.tryReadFile(WriteFiles.tryMakeFileDirectory()));
    }
}
