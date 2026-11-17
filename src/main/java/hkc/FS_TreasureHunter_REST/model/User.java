package hkc.FS_TreasureHunter_REST.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class User {
    @Id
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private Integer livesLeft;

    @Column
    private Integer record;

    public User(Integer id, String name, String password, Integer livesLeft, Integer record) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.livesLeft = livesLeft;
        this.record = record;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(Integer livesLeft) {
        this.livesLeft = livesLeft;
    }

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        this.record = record;
    }
}
