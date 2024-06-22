package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserServiceImpl userDao = new UserServiceImpl();
        userDao.createUsersTable();
        userDao.dropUsersTable();
        userDao.saveUser("Ivan","Ivanov", (byte) 38);
        userDao.saveUser("Petr","Petrov", (byte) 42);
        userDao.saveUser("Aleksandar","Aleksandrovech", (byte) 21);
        userDao.saveUser("Maksim","Maksimovich", (byte) 31);
        userDao.removeUserById(4);
        List<User> userList1 = userDao.getAllUsers();
        userList1.forEach(System.out::println);
        userDao.cleanUsersTable();


            // реализуйте алгоритм здесь
    }
}
