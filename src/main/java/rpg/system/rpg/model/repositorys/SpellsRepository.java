package rpg.system.rpg.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rpg.system.rpg.model.domain.Spells;

import java.util.List;

@Repository
public interface SpellsRepository extends JpaRepository<Spells,Long> {

    @Query(value = "SELECT * FROM spells s WHERE s.character_id = :characterId", nativeQuery = true)
    List<Spells> findSpellsByCharacterId(@Param("characterId") Long characterId);

}
