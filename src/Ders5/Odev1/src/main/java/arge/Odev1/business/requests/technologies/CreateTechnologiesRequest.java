package arge.Odev1.business.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTechnologiesRequest {

   private String name;
   private int programmingLanguageId;
}
