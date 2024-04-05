import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("CovidData.csv");

    public ArrayList<Covid19Data> loadAllCovidData() {
        ArrayList<Covid19Data> covidData = new ArrayList();
        Scanner sc = null;
        try {
            //sc = new Scanner(file);
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);

        } catch (IOException fnfe) {
            throw new RuntimeException(fnfe);
        }

        Covid19Data data = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            data = new Covid19Data(
                    (attributes[0]),
                    (attributes[1]),
                    (Integer.parseInt(attributes[2])),
                    (Integer.parseInt(attributes[3])),
                    (Integer.parseInt(attributes[4])),
                    (Integer.parseInt(attributes[5])),
                    (attributes[6])
            );

            covidData.add(data);
        }
        sc.close();
        return covidData;
    }
}
