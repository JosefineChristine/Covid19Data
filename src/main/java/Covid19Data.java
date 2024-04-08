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
        return  "Region: " + region +
                "\nAldersgruppe: " + aldergruppe + " år" +
                "\nBekræftede tilfælde i alt: " + bekræftedeTilfældeIAlt +
                "\nDøde: " + døde +
                "\nIndlagte på intensiv afdeling: " + indlagtePåIntensivAfdeling +
                "\nIndlagte: " + indlagte +
                "\nDato: " + dato +
                "\n";
    }


    public String getRegion() {
        return region;
    }

    public String getAldergruppe() {
        return aldergruppe;
    }


}
