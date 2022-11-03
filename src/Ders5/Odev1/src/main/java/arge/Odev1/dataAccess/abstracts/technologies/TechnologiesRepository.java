package arge.Odev1.dataAccess.abstracts.technologies;

import arge.Odev1.entities.concretes.technologies.Technologies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologiesRepository extends JpaRepository<Technologies,Integer> {
}
