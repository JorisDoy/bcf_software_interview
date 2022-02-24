package doris.mwamburi.dev.bcf_country_data.models.payloads.client.mledoze;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Translations implements Serializable {

    @JsonProperty("ces")
    private Ces ces;
    @JsonProperty("cym")
    private Cym cym;
    @JsonProperty("deu")
    private Deu deu;
    @JsonProperty("est")
    private Est est;
    @JsonProperty("fin")
    private Fin fin;
    @JsonProperty("fra")
    private Fra fra;
    @JsonProperty("hrv")
    private Hrv hrv;
    @JsonProperty("hun")
    private Hun hun;
    @JsonProperty("ita")
    private Ita ita;
    @JsonProperty("jpn")
    private Jpn jpn;
    @JsonProperty("kor")
    private Kor kor;
    @JsonProperty("nld")
    private Nld nld;
    @JsonProperty("per")
    private Per per;
    @JsonProperty("pol")
    private Pol pol;
    @JsonProperty("por")
    private Por por;
    @JsonProperty("rus")
    private Rus rus;
    @JsonProperty("slk")
    private Slk slk;
    @JsonProperty("spa")
    private Spa spa;
    @JsonProperty("swe")
    private Swe swe;
    @JsonProperty("urd")
    private Urd urd;
    @JsonProperty("zho")
    private Zho zho;
}
