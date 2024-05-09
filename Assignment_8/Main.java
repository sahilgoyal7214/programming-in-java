package Assign8;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        JCrud db = new JCrud();
        db.showRecords();
        db.enterRecords(1, "vaibhav", "B");
        db.showRecords();
    }
}
