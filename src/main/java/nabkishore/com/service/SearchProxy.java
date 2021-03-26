package nabkishore.com.service;

import nabkishore.com.model.SearchCityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class SearchProxy {

    private RestTemplate restTemplate;

    @Value("${serviceURLs.getCities}")
    private String uri;
     public SearchProxy(RestTemplateBuilder restTemplateBuilder)
     {
         restTemplate = restTemplateBuilder.build();
     }


    public SearchCityResponse getCities(Character city)
    {
//        UriComponents uriComponents = UriComponentsBuilder.newInstance()
//                .path(uri).build();
        SearchCityResponse searchCityResponse = restTemplate.getForObject(uri, SearchCityResponse.class);
        return searchCityResponse;
    }
}
