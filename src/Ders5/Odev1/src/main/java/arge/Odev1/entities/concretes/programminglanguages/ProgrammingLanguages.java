package arge.Odev1.entities.concretes.programminglanguages;

import arge.Odev1.entities.concretes.technologies.Technologies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "programminglanguages")
public class ProgrammingLanguages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "programmingLanguages")
    private List<Technologies> technologies;

}
