package ru.gb.jthree.lesson_2.classwork;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

import java.sql.*;

public class Ex1 {
    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:classwork2database.db");
            System.out.println(conn);
            Statement stat = conn.createStatement();
            System.out.println(stat);
            stat.executeUpdate("CREATE TABLE SIClients (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR (30) NOT NULL, email VARCHAR(45) NOT NULL, date DATE NOT NUL);");

        } catch (ClassNotFoundException  |SQLException e) {
            e.printStackTrace();
        }


    }
}
