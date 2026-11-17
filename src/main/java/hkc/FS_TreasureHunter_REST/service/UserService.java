package hkc.FS_TreasureHunter_REST.service;

import hkc.FS_TreasureHunter_REST.dto.LoginResponseDTO;
import hkc.FS_TreasureHunter_REST.model.User;
import hkc.FS_TreasureHunter_REST.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginResponseDTO checkUser(String username, String password) {
        LoginResponseDTO loginResponseDTO = null;

        Optional<User> userOpt = userRepository.findByName(username);

        if (userOpt.isEmpty()) {

            loginResponseDTO = new LoginResponseDTO("User not found");

        } else {
            User user = userOpt.get();

            if (user.getPassword().equals(password)) {

                loginResponseDTO = new LoginResponseDTO(
                        "User successfully logged in");

            } else {
                loginResponseDTO = new LoginResponseDTO(
                        "Wrong password");
            }
        }
        return loginResponseDTO;
    }
}
