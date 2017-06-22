package tk.hadeslee.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Project: springbook
 * FileName: DaoFactory
 * Date: 2017-06-22
 * Time: 오후 5:44
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DaoFactory {
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    public AccountDao accountDao() {
        return new AccountDao(connectionMaker());
    }

    public MessageDao messageDao() {
        return new MessageDao(connectionMaker());
    }

    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
