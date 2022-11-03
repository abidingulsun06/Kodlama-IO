package arge.Odev1.dataAccess.abstracts.programminglanguages;

import arge.Odev1.entities.concretes.programminglanguages.ProgrammingLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorgrammingLanguagesRepository extends JpaRepository<ProgrammingLanguages,Integer> {
}
