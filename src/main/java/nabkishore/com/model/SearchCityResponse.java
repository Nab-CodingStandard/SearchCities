
package nabkishore.com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SearchCityResponse {

    @JsonProperty("list")
    private java.util.List<CityList> cityList;

    public java.util.List<CityList> getCityList() {
        return cityList;
    }

    public void setCityList(java.util.List<CityList> cityList) {
        this.cityList = cityList;
    }

}
