package rpg.system.rpg.model.repositorys;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rpg.system.rpg.model.domain.RPGCharacters;

import java.util.List;

@Repository
public interface CharactersRepository extends JpaRepository<RPGCharacters, Long> {

    @Query(value = "SELECT * FROM Characters WHERE user_id = :user_id", nativeQuery = true)
    List<RPGCharacters> findCharactersByUserId(@Param("user_id") Long user_id);


    @Transactional
    @Modifying
    @Query(value = "UPDATE Characters SET image = :foto WHERE id = :personagemId", nativeQuery = true)
    void saveFoto(@Param("personagemId") Long personagemId, @Param("foto") byte[] foto);


    @Query(value = "SELECT image FROM Characters WHERE id = :personagemId", nativeQuery = true)
    byte[] findFotoById(@Param("personagemId") Long personagemId);

}



