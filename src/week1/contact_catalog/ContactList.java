package week1.contact_catalog;

/**
 * @author Ivan Knyazev on 18.04.2017
 * @since JDK 1.8
 */
public class ContactList {

    private static final int SIZE_CONTACTLIST = 10;
    private Contact[] list = new Contact[SIZE_CONTACTLIST];
    private int size = 0;
    private int count = 1;

    public boolean addContact(Contact contact) {
        if (contact.initContact(null, null)) return false;
        if (size == SIZE_CONTACTLIST) return false;
        list[size++] = contact;
        return true;
    }

    public String asString(){
        String result = "CONTACT LIST\nAll Contacts\n";
        for (int i = 0; i < size; i++) {
            Contact currContact = list[i];
            result += "\t" + count++ +".  " + currContact.asString() + "\n";
        }
        return result;
    }

    public void showAllContacts (){
        System.out.println(asString());
    }
}
