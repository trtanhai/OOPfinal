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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/diem", "root", "");
            
            //query
            String sql = "select * from studentmanage";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                Students std = new Students(
                		resultSet.getInt("stt"),
                        resultSet.getString("hoten"), 
                        resultSet.getString("mssv"),  
                        resultSet.getString("mamon"), 
                        resultSet.getString("tenmon"),
                        resultSet.getDouble("diembt"),
                        resultSet.getDouble("diemkt"),
                        resultSet.getDouble("diemck"),
                        resultSet.getDouble("diemtong"),
                        resultSet.getString("xeploai"));
                		
                
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
	
	public static void insert(Students std) {
		Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //select * from
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/diem", "root", "");
            
            //query
            String sql = "insert into studentmanage(hoten, mssv, mamon, tenmon, diembt, diemkt, diemck, diemtong, xeploai) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, std.getHoten());
            statement.setString(2, std.getMssv());
            statement.setString(3, std.getMamon());
            statement.setString(4, std.getTenmon());
            statement.setDouble(5, std.getDiembt());
            statement.setDouble(6, std.getDiemkt());
            statement.setDouble(7, std.getDiemck());
            statement.setDouble(8, std.getDiemtong());
            statement.setString(9, std.getXeploai());
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/diem", "root", "");
            
            //query
            String sql = "update studentmanage set hoten=?, mssv=?, mamon=?, tenmon=?, diembt=?, diemkt=?, diemck=?, diemtong=?, xeploai=? where stt=?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, std.getHoten());
            statement.setString(2, std.getMssv());
            statement.setString(3, std.getMamon());
            statement.setString(4, std.getTenmon());
            statement.setDouble(5, std.getDiembt());
            statement.setDouble(6, std.getDiemkt());
            statement.setDouble(7, std.getDiemck());
            statement.setDouble(8, std.getDiemtong());
            statement.setString(9, std.getXeploai());
            
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
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/diem", "root", "");

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

    public static List<Students> findMssv(String mssv) {
         List<Students> studentList = new ArrayList<>();
         
         Connection connection = null;
         PreparedStatement statement = null;
         
         try {
             //select * from
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/diem", "root", "");
             
             //query
             String sql = "SELECT * FROM studentmanage WHERE mssv LIKE ?";
             statement = connection.prepareStatement(sql);
             statement.setString(1, "%" + mssv + "%");

             ResultSet resultSet = statement.executeQuery();
             
             while (resultSet.next()) {                
                 Students std = new Students( 
                 		resultSet.getInt("stt"),
                        resultSet.getString("hoten"), 
                        resultSet.getString("mssv"),  
                        resultSet.getString("mamon"), 
                        resultSet.getString("tenmon"),
                        resultSet.getDouble("diembt"),
                        resultSet.getDouble("diemkt"),
                        resultSet.getDouble("diemck"),
                        resultSet.getDouble("diemtong"),
                        resultSet.getString("xeploai"));
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
