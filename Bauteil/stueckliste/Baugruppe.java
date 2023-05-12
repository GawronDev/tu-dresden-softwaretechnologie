package stueckliste;
import java.util.HashSet;
import java.util.Set;

public class Baugruppe extends Bauteil{
    private Set<Bauteil> bauteile;

    public Baugruppe(String id, Bauteil teil){
        this.id = id;
        bauteile = new HashSet<>();
        this.bauteile.add(teil);
    }

    public double preis(){
        double preis = 0;

        for(Bauteil bauteil : bauteile){
            preis = preis + bauteil.preis();
        }

        return preis;
    }

    public boolean addBauteil(Bauteil teil){
        if(bauteile.contains(teil)){
            return false;
        }
        bauteile.add(teil);
        return true;
    }

    public boolean removeBauteil(Bauteil teil){
        if(bauteile.size() == 1){
            return false;
        }
        bauteile.remove(teil);
        return true;
    }
}
