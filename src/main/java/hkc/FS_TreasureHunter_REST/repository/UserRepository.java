package hkc.FS_TreasureHunter_REST.repository;

import hkc.FS_TreasureHunter_REST.model.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository <User, Integer> {

    Optional<User> findByName(String name);
}
