# ContactsManager

Ce projet est une simple application de gestion de contacts développée en Java. Il permet d'ajouter des contacts (nom et numéro de téléphone) et de rechercher un contact par son nom pour récupérer son numéro de téléphone.

## Fonctionnalités

-   **Ajouter un contact :** Permet d'enregistrer un nouveau contact avec un nom et un numéro de téléphone.
-   **Rechercher un contact :** Retrouve le numéro de téléphone d'un contact en utilisant son nom.

## Structure du Projet

-   `Contact.java` : Représente un contact individuel.
-   `ContactsManager.java` : Gère la collection de contacts (ajout et recherche).
-   `Main.java` : Contient la méthode `main` pour exécuter l'application, démontrer l'ajout et la recherche de contacts.

## Comment Exécuter le Projet

1.  **Cloner le dépôt :**
    ```bash
    git clone [https://github.com/MalickXwest/ContactsManager.git](https://github.com/MalickXwest/ContactsManager.git)
    ```

2.  **Naviguer vers le répertoire du projet :**
    ```bash
    cd ContactsManager
    ```

3.  **Compiler les fichiers Java :**
    ```bash
    javac Contact.java ContactsManager.java Main.java
    ```

4.  **Exécuter l'application :**
    ```bash
    java Main
    
