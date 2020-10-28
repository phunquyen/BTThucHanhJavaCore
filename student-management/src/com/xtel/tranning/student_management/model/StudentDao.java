package com.xtel.tranning.student_management.model;

import com.xtel.tranning.student_management.entities.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public static void insert(Student std) throws SQLException{
        Connection connection = ConnectionFactory.createConnection();
        PreparedStatement ps = null;
        try{
            String sql = "insert into student(name,age,gender,address) values(?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, std.getName());
            ps.setInt(2, std.getOld());
            ps.setInt(3, std.getGender());
            ps.setString(4, std.getAddress_birth());
            ps.execute();
        }
        finally {
            close(ps);
            close(connection);
        }
    }

    //Lay thong tin sinh vien
    public static List<Student> getInfoSinhVien() throws SQLException {
        Connection connection = ConnectionFactory.createConnection();
        PreparedStatement ps = null;
        List<Student> listsinhvien = new ArrayList<Student>();
        try {
            String sql = "select * from student";
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3));
            }
        }
        finally {
            close(ps);
            close(connection);
        }
        return listsinhvien;
    }

    public static void close(AutoCloseable closeable){
        if(closeable == null) return;
        try{
            closeable.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
