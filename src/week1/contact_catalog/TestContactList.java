package week1.contact_catalog;

/**
 * @author Ivan Knyazev on 18.04.2017
 * @since JDK 1.8
 */
public class TestContactList {
    public static void main(String[] args) {

        ContactList contactList = new ContactList();

        Contact contact = new Contact();
        contact.initContact("Ivan", "+380678252255");

        Contact contact1 = new Contact();
        contact1.initContact("Ivan", "+38067825228y");

        Contact contact2 = new Contact();
        contact1.initContact("Iv", "+380678252287");

        System.out.println(contact1.asString());

        contactList.addContact(contact);
        contactList.addContact(contact1);
        contactList.addContact(contact2);

        System.out.println();

        contactList.showAllContacts();


    }
}
