/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hkt;
import static com.mycompany.hkt.JsonUtil.toJson;
import static spark.Spark.*;
/**
 *
 * @author duong
 */
public class API {
    
    public API( final UserService userService) {
        get("/login/:taikhoan/:matkhau", (req, res) -> toJson(userService.checkUser(req.params(":taikhoan"), req.params(":matkhau"))));
        get("/logintest/:taikhoan/:matkhau", (req, res) -> req.params(":taikhoan") + req.params(":matkhau"));
        get("/getallsv", (req, res) -> toJson(userService.getAllSinhVien()));
        get("/getallphong", (req, res) -> toJson(userService.getAllPhong()));
        get("/getallthanhvien", (req, res) -> toJson(userService.getAllThanhVien()));
        get("/home", (req, res) -> "PTIT");
        after((req, res) -> {
            res.type("application/json");
        });
    }
}
