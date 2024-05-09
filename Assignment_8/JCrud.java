package Assign8;

import java.sql.*;

public class JCrud {
    private static final String URL = "jdbc:mariadb://localhost:3306/testuser";
    private static final String USERNAME = "testuser";
    private static final String PASSWORD = "test123";
    private static Connection con = null;

    public JCrud(){
        try{
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }

    public void enterRecords(int prn, String name, String clas) throws SQLException{
        String sql = "INSERT INTO students (PRN, NAME, CLASS) VALUES (?,?,?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, prn);
        statement.setString(2, name);
        statement.setString(3, clas);

        int result = statement.executeUpdate();
        if (result > 0){
            System.out.println(result+"Row/s are updated");
        }
    }

    public void showRecords() throws SQLException{
        String sql = "SELECT * FROM students";
        Statement statement = con.createStatement();;
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println("PRN: "+resultSet.getInt("prn")+"Name: "+resultSet.getString("name") + "Class: "+resultSet.getString("class"));
        }
    }
}