package org.sambasoft.repositories;

import org.sambasoft.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
