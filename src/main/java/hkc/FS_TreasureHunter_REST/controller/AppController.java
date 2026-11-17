package hkc.FS_TreasureHunter_REST.controller;

import hkc.FS_TreasureHunter_REST.dto.LoginRequestDTO;
import hkc.FS_TreasureHunter_REST.dto.LoginResponseDTO;
import hkc.FS_TreasureHunter_REST.service.GameService;
import hkc.FS_TreasureHunter_REST.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class AppController {
    private final UserService userService;
    private final GameService gameService;

    @Autowired
    public AppController(UserService userService, GameService gameService) {
        this.userService = userService;
        this.gameService = gameService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(
            @RequestBody LoginRequestDTO loginRequestDTO
    ) {
        LoginResponseDTO loginResponseDTO = userService.checkUser(
                loginRequestDTO.getUsername(),
                loginRequestDTO.getPassword());

        return ResponseEntity.ok(loginResponseDTO);
    }

}
