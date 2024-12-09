public class ContactNode {
    String Name , PhoneNumber;
    ContactNode next;

    public ContactNode(String name, String phoneNumber, ContactNode next) {
        Name = name;
        PhoneNumber = phoneNumber;
        this.next = next;
    }

    public ContactNode(String name ,String phoneNumber) {
        Name = name;
        this.next = next;
    }


}
