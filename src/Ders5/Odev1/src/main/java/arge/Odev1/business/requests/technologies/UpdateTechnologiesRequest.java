package arge.Odev1.business.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTechnologiesRequest {
    private int technologiesId;
    private String name;
    private int programmingLanguageId;
}
