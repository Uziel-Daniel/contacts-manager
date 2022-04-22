package contactsmanager;

public class ContactObject {

    /* Fields */
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public ContactObject() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ContactObject(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
