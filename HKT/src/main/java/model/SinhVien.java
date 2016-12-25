/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author duong
 */
public class SinhVien {
    private int id;
    private String ten;
    private Date ngaysinh;
    private String email;
    private String gioitinh;
    private String gioithieu;

    public SinhVien(int id, String ten, Date ngaysinh, String email, String gioitinh, String gioithieu) {
        this.id = id;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.email = email;
        this.gioitinh = gioitinh;
        this.gioithieu = gioithieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getGioithieu() {
        return gioithieu;
    }

    public void setGioithieu(String gioithieu) {
        this.gioithieu = gioithieu;
    }
    
   

    
}
