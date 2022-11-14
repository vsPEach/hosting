package ru.peach.hosting.Database;


import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Contract;
import ru.peach.hosting.Model.User;

import java.sql.*;

public class Database {

    @Getter
    @Setter
    private Statement state;

    public static User createTeacher(User user) {
        var query = "insert into users(fullname, email, password, role, subject)" +
                String.format("values(%s, %s, %s, %s, %s)", user.getFullname(), user.getEmail(),
                        user.getPassword(), user.isTeacher(), user.getSubject());
        return new User();
    }

    public static  User createStudent(User user) {
        var query = "insert into users(fullname, email, password, role, group)" +
                String.format("values(%s, %s, %s, %s, %s)", user.getFullname(), user.getEmail(),
                        user.getPassword(), user.isTeacher(), user.getGroup());
        return new User();
    }

    public static User getUser(String email, String password) {

        var query = String.format("select * from users where email='%s' and password='%s'", email, password);
        return new User();
    }

    public static void deleteUser() {

    }


    public Database(String url, String username, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(" ", " ", " ");

    }
}
