import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> covidData = null;
        covidData = fh.loadAllCovidData();

        for (Covid19Data data: covidData) {
            System.out.println(data);
        }

    }
}
