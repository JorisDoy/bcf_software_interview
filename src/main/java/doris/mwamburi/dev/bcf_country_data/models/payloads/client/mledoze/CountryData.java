package doris.mwamburi.dev.bcf_country_data.models.payloads.client.mledoze;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CountryData implements Serializable {

    @JsonProperty("name")
    private Name name;
    @JsonProperty("tld")
    private List<String> tld = null;
    @JsonProperty("cca2")
    private String cca2;
    @JsonProperty("ccn3")
    private String ccn3;
    @JsonProperty("cca3")
    private String cca3;
    @JsonProperty("cioc")
    private String cioc;
    @JsonProperty("independent")
    private Boolean independent;
    @JsonProperty("status")
    private String status;
    @JsonProperty("unMember")
    private Boolean unMember;
    @JsonProperty("currencies")
    private Currencies currencies;
    @JsonProperty("idd")
    private Idd idd;
    @JsonProperty("capital")
    private List<String> capital = new ArrayList<>();
    @JsonProperty("altSpellings")
    private List<String> altSpellings = new ArrayList<>();;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("languages")
    private Languages languages;
    @JsonProperty("translations")
    private Translations translations;
    @JsonProperty("latlng")
    private List<Integer> latlng = new ArrayList<>();;
    @JsonProperty("landlocked")
    private Boolean landlocked;
    @JsonProperty("borders")
    private List<String> borders = new ArrayList<>();;
    @JsonProperty("area")
    private Integer area;
    @JsonProperty("flag")
    private String flag;
    @JsonProperty("demonyms")
    private Demonyms demonyms;
}
