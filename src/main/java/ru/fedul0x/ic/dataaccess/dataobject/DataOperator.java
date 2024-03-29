package ru.fedul0x.ic.dataaccess.dataobject;

// Generated 23.12.2012 2:11:14 by Hibernate Tools 3.2.1.GA
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import ru.fedul0x.ic.dataaccess.DataEntity;

/**
 * SystemUser generated by hbm2java
 */
@Entity
@Table(name = "data_operator", schema = "public")
public class DataOperator extends DataEntity {

    private String login;
    private String hashpass;

    public DataOperator() {
    }

    public DataOperator(Long id) {
        this.id = id;
    }

    public DataOperator(Long id, String login, String hashpass) {
        this.id = id;
        this.login = login;
        this.hashpass = hashpass;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "login")
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "hashpass")
    public String getHashpass() {
        return this.hashpass;
    }

    public void setHashpass(String hashpass) {
        this.hashpass = hashpass;
    }
}
