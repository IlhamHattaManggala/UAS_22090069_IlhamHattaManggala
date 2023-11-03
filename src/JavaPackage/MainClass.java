/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPackage;

import LoginApps.Login;

/**
 *
 * @author User
 */
public class MainClass {
    private String id;
    private String nama;
    private String nip;
    private String jabatan;
    private String jk;
    private String no_hp;
    private String tanggal_masuk;
    private String shift_piket;

    public String getShift_piket() {
        return shift_piket;
    }

    public void setShift_piket(String shift_piket) {
        this.shift_piket = shift_piket;
    }

    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    
    
    
    public static void main(String args[]){
        Login login = new Login();
        login.setVisible(true);
    }
}
