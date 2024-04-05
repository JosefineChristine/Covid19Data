public class Covid19Data {

    String region;
    String aldergruppe;
    int bekræftedeTilfældeIAlt;
    int døde;
    int indlagtePåIntensivAfdeling;
    int indlagte;
    String dato;

    public Covid19Data(String region, String aldergruppe, int bekræftedeTilfældeIAlt,
                       int døde, int indlagtePåIntensivAfdeling, int indlagte, String dato) {
        this.region = region;
        this.aldergruppe = aldergruppe;
        this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
        this.døde = døde;
        this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return  "region=" + region +
                ", aldersgruppe=" + aldergruppe +
                ", bekræftede tilfælde i alt=" + bekræftedeTilfældeIAlt +
                ", døde=" + døde +
                ", indlagte på intensiv afdeling=" + indlagtePåIntensivAfdeling +
                ", indlagte=" + indlagte +
                ", dato=" + dato;
    }

}
