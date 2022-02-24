package doris.mwamburi.dev.bcf_country_data.models.payloads.client.mledoze;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Native implements Serializable {

    @JsonProperty("prs")
    private Prs prs;
    @JsonProperty("pus")
    private Pus pus;
    @JsonProperty("tuk")
    private Tuk tuk;
}
