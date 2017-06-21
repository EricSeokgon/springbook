package tk.hadeslee.user.domain;

/**
 * Project: springbook
 * FileName: User
 * Date: 2017-06-21
 * Time: 오후 4:35
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class User {
    String id;
    String name;
    String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
