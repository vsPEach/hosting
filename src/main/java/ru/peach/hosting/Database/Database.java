package ru.peach.hosting.Database;


import lombok.Getter;
import lombok.Setter;
import ru.peach.hosting.Model.User;
import java.sql.*;


public class Database {

    public Statement getState() {
        return state;
    }

    public void setState(Statement state) {
        this.state = state;
    }

    private Statement state;

    public User createTeacher(User user) throws SQLException {
        var query = "insert into users(fullname, email, password, role, subject)" +
                String.format("values('%s', '%s', '%s', '%s', '%s');", user.getFullname(), user.getEmail(),
                        user.getPassword(), user.isTeacher(), user.getSubject());

        var result = getState().execute(query);
        return null;
    }

    public User createStudent(User user) throws SQLException {
        var query = "insert into users(fullname, email, password, role, group)" +
                String.format("values('%s', '%s', '%s', '%s', '%s');", user.getFullname(), user.getEmail(),
                        user.getPassword(), user.isTeacher(), user.getTeam());

        var result = getState().execute(query);
        return null;
    }

    public static User getUser(String email, String password) {

        var query = String.format("select * from users where email='%s' and password='%s'", email, password);
        return null;
    }

    public static void deleteUser(String email, String password) {

    }

    public Database() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/VideoHosting", "peach", "2301");
        setState(connection.createStatement());
    }
}
