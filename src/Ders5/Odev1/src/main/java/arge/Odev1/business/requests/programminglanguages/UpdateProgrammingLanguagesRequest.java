package arge.Odev1.business.requests.programminglanguages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgrammingLanguagesRequest {

    private int id;
    private String name;
}
