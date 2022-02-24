package doris.mwamburi.dev.bcf_country_data.models.payloads.client.mledoze;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Languages implements Serializable {

    @JsonProperty("prs")
    private String prs;
    @JsonProperty("pus")
    private String pus;
    @JsonProperty("tuk")
    private String tuk;
}
