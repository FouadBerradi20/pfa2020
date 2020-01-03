package org.sambasoft.repositories;

import org.sambasoft.entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeRepository extends JpaRepository <Demande, Long> {

}
