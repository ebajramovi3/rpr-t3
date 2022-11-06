package ba.unsa.etf.rpr;
import static java.util.Objects.hash;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava, broj;
    MedunarodniBroj(String drava, String broj){
        this.drzava = drzava;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        return drzava + "/" + broj;
    }
    @Override
    public int hashCode(){
        return hash(drzava, broj);
    }
}
