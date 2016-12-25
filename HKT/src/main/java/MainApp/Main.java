/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp;

import com.mycompany.hkt.API;
import com.mycompany.hkt.UserService;
import java.sql.SQLException;

/**
 *
 * @author duong
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new API( new UserService());
    }
}
