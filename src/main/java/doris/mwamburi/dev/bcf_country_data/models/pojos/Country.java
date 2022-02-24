package doris.mwamburi.dev.bcf_country_data.models.pojos;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country implements Serializable {
    private String cca3;

    @EqualsAndHashCode.Exclude
    private List<String> borders = new ArrayList<>();
}
