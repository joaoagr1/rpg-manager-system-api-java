package rpg.system.rpg.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rpg.system.rpg.model.domain.AttributePoints;

import java.util.List;

@Repository
public interface AttributePointsRepository extends JpaRepository<AttributePoints, Long> {

    @Query(value = "SELECT a FROM AttributePoints a WHERE a.characterId = :character_id")
    List<AttributePoints> getAttributesByCharacterId(@Param("character_id") Long character_id);

    List<AttributePoints> findAllByCharacterId(Long characterId);

}
