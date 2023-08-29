package CityGetter;


import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CityGetter {
    HashSet<String> citiesToProcess = new HashSet<>();
    //HashSet<String> citiesCatalog = new HashSet<>();

    public String getCity(char letter) {
        List<String> citiesWithCriteria = citiesToProcess.stream().
                filter(city -> city.toLowerCase().charAt(0) == letter)
                .collect(Collectors.toList());
        if(citiesWithCriteria.size() != 0) {
            citiesToProcess.remove(citiesWithCriteria.get(0));
            return citiesWithCriteria.get(0);
        }
        return "";
    }
}

