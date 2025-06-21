package ci.pigier;

//Creation d'objet contact
class Contact {
    //Attribut
    String name;
    String phoneNumber;
//Constructeur
   public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String toString() {
        return "Nom: " + name + ", Téléphone: " + phoneNumber;
    }
}


//Creation d'objet contact Manager
class ContactsManager {
    //Attribut
    Contact[] myFriends;
    int friendsCount;

    //Constructeur:
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    //Ajout de contact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
        System.out.println("Contact " + contact.name + " ajouté.");
    }
    //Recherche de contact
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}


public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        System.out.println("Gestionnaire de contact créé.");
        //Ajout de contact
        System.out.println("\n--- Ajout des contacts --");
        Contact contact1 = new Contact("Doum Malick","0152368804");
        Contact contact2 = new Contact("Onesime","0768079887");
        Contact contact3= new Contact("Othinel","0109678484");

        myContactsManager.addContact(contact1);
        myContactsManager.addContact(contact2);
        myContactsManager.addContact(contact3);


        // Recherche un contact et affiche son numéro de téléphone
        System.out.println("--- Recherche de contacts ---");
        Contact contac = myContactsManager.searchContact("Onesime");

        if (contac!= null) {
            System.out.println(contac); 
        } else {
            System.out.println("Contact non trouvé.");
        }

    }

}
