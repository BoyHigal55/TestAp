/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SCC-COLLEGE
 */
public class dbConnector {
    
    final private Connection cn;

    public dbConnector() throws SQLException {
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/comp_db","root","");
    }

    public ResultSet getData(String sql) throws SQLException {
        return cn.createStatement().executeQuery(sql);
    }

    public Connection getConnection() throws SQLException {
        return cn;
    }
}
