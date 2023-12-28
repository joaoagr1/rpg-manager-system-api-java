package rpg.system.rpg.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import rpg.system.rpg.model.domain.AttributePoints;
import rpg.system.rpg.model.domain.Skills;

import java.util.List;

public interface SkillRepository extends JpaRepository<AttributePoints,Long> {

    @Query(value = "SELECT * FROM skills WHERE character_id = :character_id ", nativeQuery = true)
    List<Skills> getSkillsByCharacterId(@Param("character_id") Long character_id);



}
