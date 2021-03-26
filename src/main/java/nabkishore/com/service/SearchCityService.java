package nabkishore.com.service;


import nabkishore.com.model.CityList;
import nabkishore.com.model.SearchCityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchCityService implements SearchCityInterface {

    @Autowired
    SearchProxy searchProxy;
    @Override
    public SearchCityResponse searchCity(final Character city) {
        SearchCityResponse searchCityResponse = searchProxy.getCities(city);
        List<CityList> lists = new ArrayList<CityList>();
        lists = searchCityResponse.getCityList().stream().filter(
                p -> p.getName().startsWith(city.toString())
        ).collect(Collectors.toList());
        searchCityResponse.setCityList(lists);
        return searchCityResponse;

    }
}
