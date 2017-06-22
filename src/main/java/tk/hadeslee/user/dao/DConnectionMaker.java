package tk.hadeslee.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project: springbook
 * FileName: DConnectionMaker
 * Date: 2017-06-22
 * Time: 오후 5:23
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/springbook", "springbook", "springbook");
    }
}
