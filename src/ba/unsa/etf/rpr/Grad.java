package ba.unsa.etf.rpr;
public enum Grad { Sarajevo("033"), Tuzla("035"), Zenica("032"), Mostar("036"), Trebinje("059");
    private String PozivniBroj;
    Grad(String PozivniBroj){
        this.PozivniBroj = PozivniBroj;
    }
    public String toString() {
        return PozivniBroj;
    }
}
