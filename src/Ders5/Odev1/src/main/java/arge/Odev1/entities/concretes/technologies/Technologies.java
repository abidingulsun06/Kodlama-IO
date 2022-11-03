package arge.Odev1.entities.concretes.technologies;

import arge.Odev1.entities.concretes.programminglanguages.ProgrammingLanguages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "technologies")
public class Technologies {

    @Id
    @Column(name = "technologies_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int technologiesId;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id")
    private ProgrammingLanguages programmingLanguages;

}
