package projectStudentManage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//import projectStudentManage.Students;
//import projectStudentManage.StudentsModify;

public class StudentsModify {
	public static List<Students> findAll() {
        List<Students> studentList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //select * from
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/monhoc", "root", "");
            
            //query
            String sql = "select * from studentmanage";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                Students std = new Students(
                		resultSet.getString("mamonhoc"),
                        resultSet.getLong("sotinchi"),  
                        resultSet.getLong("sosvdanghoc"),
                        resultSet.getDouble("diem"), 
                        resultSet.getString("ngaymo"),
                        resultSet.getString("ngayketthuc"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //end.
        
        return studentList;
    }
	
	public static void insert(Students std) {
		Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //select * from
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/monhoc", "root", "");
            
            //query
            String sql = "insert into studentmanage(hoten, mssv, namsinh, gioitinh, lop, email, mon1, diem1, mon2, diem2, mon3, diem3) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, std.getMamonhoc());
            statement.setLong(2, std.getSotinchi());
            statement.setLong(3, std.getSosvdanghoc());
            statement.setDouble(4, std.getDiem());
            statement.setString(5, std.getNgaymo());
            statement.setString(6, std.getNgayketthuc());
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
	} 
	
	public static void update(Students std) {
		Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //select * from
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/monhoc", "root", "");
            
            //query
            String sql = "update studentmanage set mamonhoc=?, sotinchi=?, sosvdanghoc=?, diem=?, ngaymo=?, ngayketthuc=?,";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, std.getMamonhoc());
            statement.setLong(2, std.getSotinchi());
            statement.setLong(3, std.getSosvdanghoc());
            statement.setDouble(4, std.getDiem());
            statement.setString(5, std.getNgaymo());
            statement.setString(6, std.getNgayketthuc());
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } 
        }
        
       
	public static void delete(int stt) {
	    Connection connection = null;
	    PreparedStatement statement = null;

	    try {
	        // establish database connection
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/monhoc", "root", "");

	        // create the SQL query with a placeholder for the STT parameter
	        String sql = "DELETE FROM studentmanage WHERE stt = ?";
	        statement = connection.prepareStatement(sql);

	        // set the value of the STT parameter to the provided argument
	        statement.setInt(1, stt);

	        // execute the query
	        statement.executeUpdate();

	    } catch (SQLException ex) {
	        Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
	    } finally {
	        // close the statement and connection, if they were successfully opened
	        try {
	            if (statement != null) {
	                statement.close();
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        try {
	            if (connection != null) {
	                connection.close();
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	}

    public static List<Students> findMonhoc(String monhoc1) {
         List<Students> studentList = new ArrayList<>();
         
         Connection connection = null;
         PreparedStatement statement = null;
         
         try {
             //select * from
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/monhoc", "root", "");
             
             //query
             String sql = "SELECT * FROM studentmanage WHERE mssv LIKE ?";
             statement = connection.prepareStatement(sql);
             statement.setString(1, "%" + monhoc1 + "%");

             ResultSet resultSet = statement.executeQuery();
             
             while (resultSet.next()) {                
                 Students std = new Students( 
                 		resultSet.getString("mamonhoc"),
                        resultSet.getLong("sotinchi"),  
                        resultSet.getLong("sosvdanghoc"),
                        resultSet.getDouble("diem"), 
                        resultSet.getString("ngaymo"),
                        resultSet.getString("ngayketthuc"));
                 studentList.add(std);
             }
         } catch (SQLException ex) {
             Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             if(statement != null) {
                 try {
                     statement.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
             
             if (connection != null) {
                 try {
                     connection.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(StudentsModify.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
         }
         //end.
         
         return studentList;
     }
	
}
