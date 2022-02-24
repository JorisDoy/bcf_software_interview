package doris.mwamburi.dev.bcf_country_data.models.payloads.client.mledoze;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Demonyms implements Serializable {

    @JsonProperty("eng")
    private Eng eng;
    @JsonProperty("fra")
    private Fra__1 fra;
}
