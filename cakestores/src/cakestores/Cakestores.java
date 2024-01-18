/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakestores;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
/**
 *
 * @author Admin
 */
public class Cakestores {
    
    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        public static void main(String[] args) throws SQLException {
        var server = "LaptopcuaHuyne\\MSSQLSERVER1";
        var user = "sa";
        var password = "1203";
        var db= "CakeStores";
        var port= 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        try(Connection conn = ds.getConnection()){
           System.out.println("ket noi thanh cong sql roi may!");
           System.out.println(conn.getCatalog());
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        }
    }
}
    