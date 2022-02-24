package doris.mwamburi.dev.bcf_country_data.models.payloads.client.mledoze;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Idd implements Serializable {

    @JsonProperty("root")
    private String root;
    @JsonProperty("suffixes")
    private List<String> suffixes = new ArrayList<>();
}
