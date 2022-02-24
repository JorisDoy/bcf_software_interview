package doris.mwamburi.dev.bcf_country_data.models.payloads.client.mledoze;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Fra__1 implements Serializable {

    @JsonProperty("f")
    private String f;
    @JsonProperty("m")
    private String m;
}
