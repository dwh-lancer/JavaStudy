package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by dlancer on 2017/5/29.
 */

public class JDBC_Test {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/first_mysql_test"; // 数据库的Url;
        String userName = "root";
        String password = "123456";
        String driver = "com.mysql.jdbc.Driver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,userName,password);
            statement = connection.createStatement();
            statement.execute("insert in Employee values ()");
            resultSet = statement.executeQuery("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (connection == null) connection.close();
                if (statement == null) statement.close();
                if (resultSet == null)resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
