package doris.mwamburi.dev.bcf_country_data.models.payloads.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse implements Serializable {

    @JsonProperty("route")
    private List<String> route = new ArrayList<>();
}
