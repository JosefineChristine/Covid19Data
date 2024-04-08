import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    String userInput = "";
    FileHandler fileHandler = new FileHandler();

    public void sortData() {
        ArrayList<Covid19Data> covid19Data = fileHandler.loadAllCovidData();

        System.out.println("Her kan du sortere Covid19 data");
        System.out.println("Skriv ''region'' hvis du vil sortere efter region");
        System.out.println("Skriv ''alder'' hvis du vil sortere efter aldersgruppe");

        userInput = sc.next();

        if (userInput.equalsIgnoreCase("region")) {
            covid19Data.sort(new RegionComparator());
        } else if (userInput.equalsIgnoreCase("alder")) {
            covid19Data.sort(new AldersGruppeComparator());
        } else {
            System.out.println("Det indtastede findes ikke");
        }
        System.out.println(covid19Data);
    }

}