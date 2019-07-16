package com.pz;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {


    private static String jdbcUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private static String className = "com.mysql.jdbc.Driver";
    private static String user = "kylo";
    private static String password = "kylo";

    public static Connection getConnection() {

        Connection connection =null;
        try {
            // 加载数据库驱动
            Class.forName(className);
            // 获取数据库连接
            connection = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (Exception e) {
            System.out.println("连接失败");
        }
        return connection;
    }
}
