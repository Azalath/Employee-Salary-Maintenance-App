import java.sql.*;

public class PayrollJDBC {
    public static void main(String[] args) {

        try {


            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_payroll", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from emp_info");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("EmpID"));
                System.out.println(resultSet.getString("EmpName"));
                System.out.println(resultSet.getString("EmpAge"));
                System.out.println(resultSet.getString("EmpMailID"));
                System.out.println(resultSet.getString("EmpPhoneNo"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}