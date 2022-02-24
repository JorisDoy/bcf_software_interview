package doris.mwamburi.dev.bcf_country_data.entry.controllers;

import doris.mwamburi.dev.bcf_country_data.models.payloads.api.responses.ApiResponse;
import doris.mwamburi.dev.bcf_country_data.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Pattern;

@Validated
@RestController
@RequestMapping(value = "/routing")
public class ApiController {

    private final ApiService apiService;

    private static final String COUNTRY_CODE_PATTERN = "[a-zA-Z]{3}";

    @Autowired
    public ApiController(ApiService apiService) {this.apiService = apiService;}

    @GetMapping(value = "/{origin}/{destination}", produces = {"application/json"})
    public ResponseEntity<ApiResponse>processGetCountryRoutingDataRequest(@PathVariable @Pattern(regexp = COUNTRY_CODE_PATTERN) final String origin, @PathVariable @Pattern(regexp = COUNTRY_CODE_PATTERN) final String destination){
        return apiService.processGetCountryRoutingDataRequestFindRoute(origin, destination);
    }
}
