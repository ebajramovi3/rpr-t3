package ba.unsa.etf.rpr;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private HashMap<String, TelefonskiBroj> brojevi;
    public void dodaj(String ime, TelefonskiBroj broj){
        brojevi.put(ime, broj);
    }

    public String dajBroj(String ime){
        return brojevi.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> osoba : brojevi.entrySet()){
            if(osoba.getValue() == broj) return osoba.getKey();
        }
        return null;
    }

    public String naSlovo(char s){
        int brojac = 0;
        for(Map.Entry<String, TelefonskiBroj> osoba : brojevi.entrySet()){
            brojac++;
            if(osoba.getKey().startsWith(String.valueOf(s))) return brojac + ". " + osoba.getKey() + " - " + osoba.getValue().ispisi();
        }
        return null;
    }

    Set<String> izGrada(Grad g){
        TreeSet<String> osobeIzIstogGrada = new TreeSet<String>();
        for(Map.Entry<String, TelefonskiBroj> osoba : brojevi.entrySet()){
            if(osoba.getValue() instanceof  FiksniBroj && osoba.getValue().ispisi().startsWith(g.toString()))
                osobeIzIstogGrada.add(osoba.getKey());
        }
        return osobeIzIstogGrada;
    }
    Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        TreeSet<TelefonskiBroj> brojeviOsobaIzIstogGrada = new TreeSet<TelefonskiBroj>();
        for(Map.Entry<String, TelefonskiBroj> osoba : brojevi.entrySet()){
            if(osoba.getValue() instanceof  FiksniBroj && osoba.getValue().ispisi().startsWith(g.toString()))
                brojeviOsobaIzIstogGrada.add(osoba.getValue());
        }
        return brojeviOsobaIzIstogGrada;
    }
}
