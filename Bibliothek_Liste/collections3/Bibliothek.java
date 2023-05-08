package collections3;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Bibliothek {

    // bestand muss auf List spezialisiert werden wegen Anwendung
    // der Klasse Collections und des indizierten Zugriffs auf bestand
    private Map<String, Set<Buch>> bestand;

    public Bibliothek() {
        bestand = new TreeMap<>();
        // oder
        // bestand = new LinkedList<Buch>();
    }

    // Sortierung nach der ISBN
    public boolean sortiertesEinfuegen(Buch neuesBuch) {
        if(!bestand.containsKey(neuesBuch.getAutor())){
            bestand.put(neuesBuch.getAutor(), new TreeSet<>());
        }
        return bestand.get(neuesBuch.getAutor()).add(neuesBuch);
    }

    public Buch sucheNachISBN(String isbn) {
        for(Set<Buch> bucher : bestand.values()){
            for(Buch buch : bucher){
                if(buch.getIsbn().equals(isbn)){
                    return buch;
                }
            }
        }
        return null;
    }

    public Collection<Buch> sucheNachAutor(String autor) {
        for (String autor2 : bestand.keySet()){
            if(autor2.equals(autor)){
                return bestand.get(autor);
            }
        }
        return Collections.emptySet();
    }

    public Map<String, Set<Buch>> bestandNachAutorAuflisten() {
        
        return bestand;
    }
}
