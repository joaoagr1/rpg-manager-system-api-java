package rpg.system.rpg.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rpg.system.rpg.model.domain.Journal;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {
}
