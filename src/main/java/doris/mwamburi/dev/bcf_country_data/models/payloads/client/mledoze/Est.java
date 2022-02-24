package doris.mwamburi.dev.bcf_country_data.models.payloads.client.mledoze;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Est implements Serializable {

    @JsonProperty("official")
    private String official;
    @JsonProperty("common")
    private String common;

}
