package CityGetter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CityGetterByFile extends CityGetter{
    public CityGetterByFile() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/main/resources/Cities.txt"));
            String line = reader.readLine();

            while (line != null) {
                citiesToProcess.add(line);
                System.out.println(line);
                // read next line
                line = reader.readLine();

            }
            citiesCatalog.addAll(citiesToProcess);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
