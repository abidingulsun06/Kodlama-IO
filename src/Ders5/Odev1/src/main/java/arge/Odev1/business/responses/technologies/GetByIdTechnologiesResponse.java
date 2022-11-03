package arge.Odev1.business.responses.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdTechnologiesResponse {

    private int id;
    private String name;
    private String programmingLanguageName;
}
