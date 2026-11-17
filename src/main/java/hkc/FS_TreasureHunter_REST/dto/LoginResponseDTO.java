package hkc.FS_TreasureHunter_REST.dto;

public class LoginResponseDTO {
    private String status;

    public LoginResponseDTO(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
