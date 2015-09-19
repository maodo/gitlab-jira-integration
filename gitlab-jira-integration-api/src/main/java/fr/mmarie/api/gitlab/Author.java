package fr.mmarie.api.gitlab;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(of = "name")
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;
}
