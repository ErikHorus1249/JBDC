/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoicsdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erik
 */
public class StatementVsResultset {
    
    public static void main(String[] args) throws SQLException {
        
        Connection con = KetNoiCSDL.getConnectionJBDC(); // khoi tao ket noi co so dun lieu
        
        Statement statement = con.createStatement(); // su dung statement dung tu connecton 
        
//        Cau lenh SQL su dung truy van 
        String sql1 = "SELECT * FROM admin;" ;
        String sql2 = "INSERT INTO admin (adminName, adminPass) VALUES ('Hoàng Văn Đỉnh','1478abc');" ;
//        Ket qua lay ra su dung phuong thuc executeQuery
        ResultSet rs = statement.executeQuery(sql1);
        
//        while(rs.next()){ // lap cho den khi lay het du lieu
//            System.out.println(rs.getInt("adminId") + " " + rs.getString("adminName") +
//                    " " + rs.getString("adminPass"));   // in ra ket qua truy xuat
//        }
        if(statement.execute(sql2)){
            System.out.println("Chen thanh cong");
        }else{
            System.out.println("Chen ko thanh cong");
        }
    }
}
