/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hkt;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Phong;
import model.SinhVien;
import model.ThanhVien;


/**
 *
 * @author duong
 */
public class UserService {
    Statement statement;
    Connection connection;
    public UserService() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://192.168.0.194:3306/tuyentv", "duongpv", "123");
        System.out.println("Database connected");
       statement = connection.createStatement();
    }
    public boolean checkUser(String account, String password) {
        String sql = "select * from admin";
        try {
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {
                //Lay ket qua tu rs
                String accountResult = rs.getString("taikhoan");
                String passwordResult = rs.getString("matkhau");
                System.out.println("taikhoan :" + accountResult);
                System.out.println("matkhau :" + passwordResult);
                if (account.equals(accountResult) && password.equals(passwordResult)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
        return false;
    }
    public ArrayList<SinhVien> getAllSinhVien() {
        ArrayList<SinhVien> alSinhVien = new ArrayList<SinhVien>();
        String sql = "select * from sv";
        try {
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {
                //Lay ket qua tu rs
                int id = rs.getInt("id_sv");
                String ten = rs.getString("ten");
                Date ngaysinh = rs.getDate("ngaysinh");
                String email = rs.getString("email");
                String gioitinh = rs.getString("gioitinh");
                String gioithieu = rs.getString("gioithieu");
                SinhVien sv = new SinhVien(id, ten, ngaysinh, email, gioitinh, gioithieu);
                alSinhVien.add(sv);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
        return alSinhVien;
    }
   public ArrayList<Phong> getAllPhong() {
       ArrayList<Phong> alPhong = new ArrayList<Phong>();
       String sql = "select * from phong";
       try {
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {
                //Lay ket qua tu rs
                int id = rs.getInt("id_phong");
                int socho = rs.getInt("socho");
                Phong phong = new Phong(id, socho);
                alPhong.add(phong);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
       return alPhong;
       
   }
   public ArrayList<ThanhVien> getAllThanhVien() {
       ArrayList<ThanhVien> alThanhVien = new ArrayList<ThanhVien>();
       String sql = "select * from tv";
       try {
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {
                //Lay ket qua tu rs
                int id = rs.getInt("id_tv");
                String ten = rs.getString("ten");
                int team = rs.getInt("team");
                ThanhVien tv = new ThanhVien(id,ten, team);
                alThanhVien.add(tv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
       return alThanhVien;
   }
    
//    public ArrayList<User> getAllUsers() throws SQLException {
//        System.out.println("chay vao day");
//        ResultSet res = statement.executeQuery(
//                "select * from sinhvien;"
//                );
//        System.out.println("chay toi day");
//        
//        while (res.next()) {
//            System.out.println("chay vo res");
//            User a = new User(res.getInt(1),res.getString(2), res.getString(3));
//            System.out.println("xong user");
//            System.out.println(a.toString());
//            alUser.add(a);
//            System.out.println("da add");
//        }
//        
//        return alUser;
//    }
//  
//    public User getUser( String id ) throws SQLException {
//        System.out.println("tim kiem");
//        ResultSet res = statement.executeQuery(
//                " select * from sinhvien where sinhvien.id = " + id
//        );
//        User user = new User(res.getInt("id"),res.getString("name"), res.getString("email"));
//        if( user != null ) return user;
//        return null;
//    }
//    
}
