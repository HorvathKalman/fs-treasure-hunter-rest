package hkc.FS_TreasureHunter_REST.service;

import hkc.FS_TreasureHunter_REST.repository.GameRepository;
import hkc.FS_TreasureHunter_REST.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
   public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }



}
