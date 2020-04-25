package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.UserModelApplication;
import com.lambdaschool.usermodel.models.CountryData;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * The entry point to work with the Country Data API
 * <br><a href="https://restcountries.eu">https://restcountries.eu</a>
 */
@RestController
@RequestMapping("/otherapis")
public class CountryDataController
{
    /**
     * Creates the object that is needed to do a client side Rest API call.
     * We are the client getting data from a remote API.
     */
    private RestTemplate restTemplate = new RestTemplate();

    /**
     * Populates a public field from the main class. That field contains data from the last queried country
     * <br>Example: <a href="http://localhost:2019/otherapis/populatecountrydata/usa">http://localhost:2019/otherapis/populatecountrydata/usa</a>
     *
     * @param countrycode The country code (String) of the country you seek. For example usa, mex, ca, fin
     * @return Status of created
     */
    @GetMapping("/populatecountrydata/{countrycode}")
    public ResponseEntity<?> populateInfoForCountryCode(
        @PathVariable
            String countrycode)
    {
        // create the url to access the country data
        String requestURL = "https://restcountries.eu/rest/v2/alpha/" + countrycode;
        // create the responseType expected. Notice the List<CountryData> is the data type we are expecting back from the API!
        ParameterizedTypeReference<CountryData> responseType = new ParameterizedTypeReference<>()
        {
        };
        // create the response entity. do the get and get back information
        ResponseEntity<CountryData> responseEntity = restTemplate.exchange(requestURL,
            HttpMethod.GET,
            null,
            responseType);
        // now that we have our data, put it into our list!
        UserModelApplication.ourCountryData = responseEntity.getBody();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * Returns the data for the last country's data that got loaded.
     * <br>Example: <a href="http://localhost:2019/otherapis/currentcountrydata">http://localhost:2019/otherapis/currentcountrydata</a>
     *
     * @return The current country data
     */
    @GetMapping("/currentcountrydata")
    public ResponseEntity<?> listInfoForCountryData()
    {
        return new ResponseEntity<>(UserModelApplication.ourCountryData,
            HttpStatus.OK);
    }

    /**
     * Endpoint used to test parameters
     *
     * @param testing a just string that gets reported back to the user
     * @return The string from testing and status OK
     */
    @GetMapping("/testing")
    public ResponseEntity<?> getTestingParameter(@RequestParam String testing)
    {
        return new ResponseEntity<>(testing, null, HttpStatus.OK);
    }
}
