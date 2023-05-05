package collections1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Bibliothek {

    // bestand muss auf List spezialisiert werden wegen Anwendung
    // der Klasse Collections und des indizierten Zugriffs auf bestand
    private Set<Buch> bestand;

    public Bibliothek() {
        bestand = new TreeSet<Buch>();
        // oder
        // bestand = new LinkedList<Buch>();
    }

    // Sortierung nach der ISBN
    public boolean sortiertesEinfuegen(Buch neuesBuch) {
        return bestand.add(neuesBuch); // True falls erforgleich addiert bzw. falsch
    }

    public Buch sucheNachISBN(String isbn) {
        // Method 1 For each loop
        // for(Buch buch : bestand){
        //     if(buch.getIsbn().equals(isbn)){
        //         return buch;
        //     }
        // }

        // return null;

        Iterator<Buch> iterator = bestand.iterator();

        while(iterator.hasNext()){
            Buch buch = iterator.next();
            if(buch.getIsbn().equals(isbn)){
                return buch;
            }
        }
        
        return null;

    }

    public Collection<Buch> sucheNachAutor(String autor) {
        // sequentielle Suche im Buchbestand
        Collection<Buch> suchergebnis = new TreeSet<Buch>();
        for(Buch buch : bestand){
            if(buch.getAutor().equals(autor)){
                suchergebnis.add(buch);
            }
        }
        return suchergebnis;
    }

    public Map<String, Set<Buch>> bestandNachAutorAuflisten() {
        Map<String, Set<Buch>> ergebnis = new TreeMap<>();
        for(Buch buch: bestand){
            if(ergebnis.containsKey(buch.getAutor())){
                ergebnis.get(buch.getAutor()).add(buch);
            } else {
                Set<Buch> temp = new TreeSet<>();
                temp.add(buch);
                ergebnis.put(buch.getAutor(), temp);
            }
        }

        return ergebnis;
    }
}
