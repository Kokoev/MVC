package mvc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setLogin(rs.getString("login"));
        student.setPassword(rs.getString("password"));
        student.setAge(rs.getInt("age"));
        student.setGender(rs.getString("gender"));
        student.setSchool(rs.getString("School"));
        return student;
    }
}