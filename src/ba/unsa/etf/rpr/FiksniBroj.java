package ba.unsa.etf.rpr;
import static java.util.Objects.hash;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        return grad + "/" + broj;
    }
    @Override
    public int hashCode(){
        return hash(grad, broj);
    }
}
