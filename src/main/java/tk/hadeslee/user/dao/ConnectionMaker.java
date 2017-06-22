package tk.hadeslee.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Project: springbook
 * FileName: ConnectionMaker
 * Date: 2017-06-22
 * Time: 오후 5:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
