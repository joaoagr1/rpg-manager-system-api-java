package rpg.system.rpg.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import rpg.system.rpg.model.domain.AttributePoints;

import java.util.List;

public interface AttributePointsRepository extends JpaRepository<AttributePoints,Long> {

    //getAttributesByCharacterId

    @Query(value = "SELECT * FROM attributepoints WHERE character_id = :character_id ", nativeQuery = true)
    List<AttributePoints> getAttributesByCharacterId(@Param("character_id") Long character_id);




}
