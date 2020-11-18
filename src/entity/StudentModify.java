package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class StudentModify {
	public static List<Student> findAll(){
		List<Student> studentList = new ArrayList<>();
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "");
			
			//query
			String sql = "select * from student";
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				Student std = new Student(resultSet.getInt("id"),
						resultSet.getString("fullname"),
						resultSet.getString("gender"),
						resultSet.getString("email"),
						resultSet.getString("phone_number"),
						resultSet.getInt("age"));
				studentList.add(std);
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
		return studentList;
	}
}
