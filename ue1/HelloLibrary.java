/*
 * Lehrstuhl Softwaretechnologie, TU Dresden, Datei HelloLibrary.java
 *
 * HelloLibrary-Klasse implementiert eine Anwendung,
 * die die Aufnahme von Büchern simuliert
 */

public class HelloLibrary {
    // Simulation durch main()
    public static void main(String[] args) {
        // Erzeugung eines Library-Objektes
        Library library = new Library();

        // Erzeugung von zwei Book-Objekten
        Book umlBook = new Book("UML");
        Book javaBook = new Book("Java");

        // Nachricht an die Library, dass die Books aufgenommen werden sollen
        library.register(umlBook);
        library.register(javaBook);
    }
}
