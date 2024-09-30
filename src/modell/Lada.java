package modell;

public class Lada {
    private String anyag, felirat;
    private boolean kincs;

    //getterből akkor lesz setter, ha referenciatípus(nagybetűs típus)
    //ne fedje fel a belső tipust
    //String nem referencia, hanem nem módosítható típus
    
    public Lada(String anyag, String felirat) {
        this(anyag, felirat, false);
    }
  
    public Lada(String anyag, String felirat, boolean kincs) {
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void kincsetElhelyez(){
        this.kincs = true;
    }
    
    public void kincsetKivesz(){
        this.kincs = false;
    }
    
}
