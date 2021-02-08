package com.cbn.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdUser;
    private String nama;
    private String jk;
    private String userName;
    private String password;
    private String role;
    private String email;
    private Date tglRegis;
    private Date tglLahir;
private String alamat;
private String KKA;
private String NoHP;
private String image;

public User () {}
    public User(Integer idUser, String nama, String jk, String userName, String password, String role, String email, Date tglRegis, Date tglLahir, String alamat, String KKA, String noHP, String image) {
        IdUser = idUser;
        this.nama = nama;
        this.jk = jk;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.email = email;
        this.tglRegis = tglRegis;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.KKA = KKA;
        NoHP = noHP;
        this.image = image;
    }


    public Integer getIdUser() {
        return IdUser;
    }

    public void setIdUser(Integer idUser) {
        IdUser = idUser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTglRegis() {
        return tglRegis;
    }

    public void setTglRegis(Date tglRegis) {
        this.tglRegis = tglRegis;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKKA() {
        return KKA;
    }

    public void setKKA(String KKA) {
        this.KKA = KKA;
    }

    public String getNoHP() {
        return NoHP;
    }

    public void setNoHP(String noHP) {
        NoHP = noHP;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

public String toString() {
return "User{" +
        "id=" + IdUser +
    ",nama=" + nama+
    ",jk=" + jk+
    ",userName=" + userName+
    ",password=" + password+
    ",role=" + role+
    ",email=" + email+
    ",tglRegis=" + tglRegis+
    ",tglLahir=" + tglLahir+
    ",alamat=" + alamat+
    ",KKA=" + KKA+
    ",NoHP=" + NoHP+
    ",image=" + image+
        "}";
}



}
