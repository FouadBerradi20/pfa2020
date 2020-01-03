package org.sambasoft.repositories;

import java.util.List;

import org.sambasoft.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommandeRepository extends JpaRepository<Commande, Long>{
	
	
	
	@Query(value="select distinct p.nom a, count(*) as nbr from commande c,personne p where c.personne_id = p.id  group by p.nom", nativeQuery = true)
	Object[] getNbrcmdByPersonne(); 

}
