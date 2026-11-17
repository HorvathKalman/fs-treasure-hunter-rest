package hkc.FS_TreasureHunter_REST.repository;

import hkc.FS_TreasureHunter_REST.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository <Game, Integer> {
}
