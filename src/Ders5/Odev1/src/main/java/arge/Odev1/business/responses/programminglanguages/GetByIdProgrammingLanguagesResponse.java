package arge.Odev1.business.responses.programminglanguages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdProgrammingLanguagesResponse {
    private int id;
    private String name;

}
