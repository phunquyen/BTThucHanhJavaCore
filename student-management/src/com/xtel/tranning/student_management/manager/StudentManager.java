package com.xtel.tranning.student_management.manager;

import com.sun.deploy.association.Action;
import com.xtel.tranning.student_management.entities.Student;
import com.xtel.tranning.student_management.model.ConnectionFactory;
import com.xtel.tranning.student_management.model.StudentDao;

import java.io.IOException;
import java.sql.*;
import java.util.*;

public class StudentManager {
    private static Scanner sc = new Scanner(System.in);

    public void add(int numberOfStudents) throws SQLException {
        //input student
        List<Student> stdStudentList = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            Student std = input();
            stdStudentList.add(std);
        }


        // insert student into db
        for (Student student : stdStudentList) {
            try {
                StudentDao.insert(student);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //check
    public boolean checkName() throws SQLException {
        Boolean check = false;
        StudentDao studentDao = new StudentDao();
        List<Student> listStudent = studentDao.getInfoSinhVien();
        for (int i = 0; i <listStudent.size(); i++) {
            if(Student.name.equals(listStudent.get(i).getName())) {
                check = false;
            }
            else {
                check = true;
            }
        }
        return check;
    }
    //
    public Student input() throws SQLException {
        String name = null;
        while (checkName() == false) {
            System.out.print("Enter name: ");
            name = sc.nextLine();
        }
        System.out.print("Enter old: ");
        int old = Integer.parseInt(sc.nextLine());
        System.out.print("Enter address birth: ");
        String address_birth = sc.nextLine();
        System.out.print("Enter gender (nam - 1, nu - 0): ");
        int gender = Integer.parseInt(sc.nextLine());
        System.out.println("");
        return new Student(name, old, address_birth, gender);
    }
}

