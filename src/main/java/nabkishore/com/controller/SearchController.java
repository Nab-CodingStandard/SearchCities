package nabkishore.com.controller;

import nabkishore.com.model.SearchCityResponse;
import nabkishore.com.service.SearchCityInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    SearchCityInterface searchCityInterface;

    @RequestMapping(method = RequestMethod.GET, path = "/{cityChar}")
    public ResponseEntity<SearchCityResponse> searCity(@PathVariable Character cityChar)
    {
        SearchCityResponse searchCityResponse = searchCityInterface.searchCity(cityChar);
        return new ResponseEntity<SearchCityResponse>(searchCityResponse, HttpStatus.OK);
    }
}
