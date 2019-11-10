package com.cristobal.appnotas.models;
import com.orm.dsl.Table;

@Table
public class Usuario {
    private Long id;
    private String fullname;
    private String user;
    private String email;
    private String password;

    public Usuario() {
    }

    public Usuario( String fullname, String user, String email, String password) {
        this.fullname = fullname;
        this.user = user;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", user='" + user + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
