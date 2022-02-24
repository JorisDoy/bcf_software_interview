package doris.mwamburi.dev.bcf_country_data.services;

import doris.mwamburi.dev.bcf_country_data.models.payloads.api.responses.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface ApiService {
    ResponseEntity<ApiResponse> processGetCountryRoutingDataRequestFindRoute(String origin, String destination);
}
