package tk.hadeslee.user.dao;

import org.junit.Test;
import tk.hadeslee.user.domain.User;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Project: springbook
 * FileName: UserDaoTest
 * Date: 2017-06-21
 * Time: 오후 4:50
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class UserDaoTest {
    static ConnectionMaker connectionMaker = new DConnectionMaker();
    static UserDao dao = new UserDao(connectionMaker);
    static User user = new User();

    @Test
    public void add_getTest() throws Exception {
        user.setId("hadeslee");
        user.setName("이석곤");
        user.setPassword("married");

        //dao.add(user);

        //System.out.println(user.getId() + "등록 성공");
        assertThat(user.getId(), is("hadeslee"));

        User user1 = dao.get(user.getId());
        //System.out.println(user1.getName());
        assertThat(user1.getName(),is("이석곤"));

        //System.out.println(user1.getPassword());
        assertThat(user1.getPassword(),is("married"));

        //System.out.println(user1.getId() + "조회 성공");
        assertThat(user1.getName(),is("이석곤"));
    }

    @Test
    public void get() throws Exception {

        User user1 = dao.get(user.getId());
        System.out.println(user1.getName());
        //assertThat(user1.getName(),is("이석곤"));
        //System.out.println(user1.getPassword());
        //assertThat(user1.getPassword(),is("married"));

        //System.out.println(user1.getId() + "조회 성공");
        //assertThat(user1.getName(),is("이석곤"));
    }

}