package tk.hadeslee.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project: springbook
 * FileName: DUserDao
 * Date: 2017-06-21
 * Time: 오후 5:57
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DUserDao extends UserDao {
    public Connection getConnection() throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/springbook", "springbook", "springbook");
    }
}
