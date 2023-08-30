package CityGetter;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CityGetter {
    HashSet<String> citiesToProcess = new HashSet<>();
    HashSet<String> citiesCatalog = new HashSet<>();
    HashSet<String> alreadyProcessed = new HashSet<>();
    public boolean validateCity(String cityName) {
        return citiesCatalog.contains(cityName);
    }
    public void addProcessedCity(String cityName) {
        alreadyProcessed.add(cityName);
    }
    public boolean isAlreadyProcessed(String cityName) {
        return alreadyProcessed.contains(cityName);
    }
    public String getCity(char letter) {
        List<String> citiesWithCriteria = citiesToProcess.stream()
                .filter(city -> city.toLowerCase().charAt(0) == letter)
                .collect(Collectors.toList());
        if(citiesWithCriteria.size() != 0) {
            citiesToProcess.remove(citiesWithCriteria.get(0));
            addProcessedCity(citiesWithCriteria.get(0));
            return citiesWithCriteria.get(0);
        }
        return "";
    }
}

