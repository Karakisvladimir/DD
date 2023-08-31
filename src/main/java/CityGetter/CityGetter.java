package CityGetter;


import java.util.*;
import java.util.stream.Collectors;

public abstract class CityGetter {
    protected static LinkedList<String> citiesToProcess = new LinkedList<>();
    protected static LinkedList<String> citiesCatalog = new LinkedList<>();
    protected static LinkedList<String> alreadyProcessed = new LinkedList<>();

    protected String lastCityByComputer = "";
    public static void resetAll() {
        alreadyProcessed.clear();
        citiesToProcess.clear();
        citiesToProcess.addAll(citiesCatalog);
    }
    public String getLastCityByComputer() {
        return lastCityByComputer;
    }

    public boolean isCityUsed(String cityName){
        return  alreadyProcessed.contains(cityName);
    }

    public boolean validateCity(String cityName) {
        if(cityName.equals("")) {
            return false;
        }
        if(cityName.toLowerCase().charAt(0) != lastCityByComputer.charAt(lastCityByComputer.length()-1)) {
            return false;
        }
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
            lastCityByComputer = citiesWithCriteria.get(0);
            return citiesWithCriteria.get(0);
        }
        return "";
    }
}

