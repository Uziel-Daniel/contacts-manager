package contactsmanager;

public class ContactObject {

    /* Fields */
    private String name;
    private String phoneNumber;

    public ContactObject(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        ;
    }

    public String getName() {
        return this.name;
    }

    public ContactObject() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
