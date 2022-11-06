package ba.unsa.etf.rpr;
import static java.util.Objects.hash;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;
    MobilniBroj(int mreza, String broj){
        mobilnaMreza = mreza;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        return "0" + mobilnaMreza + "/" + broj;
    }
    @Override
    public int hashCode(){
        return hash(mobilnaMreza, broj);
    }
}
