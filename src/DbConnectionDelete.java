//To Delete Records
//Vendra And Saanvi

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnectionDelete {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagement_db","root","");
            System.out.println("\nDeleting Records....");
            Statement stmt1 = con.createStatement();

            String sql1 = "DELETE from event_staffs WHERE EStaffid = 513";
            stmt1.executeUpdate(sql1);


            System.out.println("\nRecords Deleted!");
            System.out.println("\n");
            Statement stmt2 = con.createStatement();

            ResultSet rs = stmt2.executeQuery("select * from event_staffs");
            System.out.println("Ename\t\t\t\tEDOB\t\t\t\t\tEPost\t\t\t\t\tEStaffid\t\t\t\tEAddress\t\t\tYearsOfExperience\t\t\t\tSalary");

            while(rs.next())
                System.out.println(rs.getString(1)+"\t\t\t\t"+rs.getDate(2)+"\t\t\t\t"+rs.getString(3)+"\t\t\t\t\t\t"+rs.getInt(4)+"\t\t\t\t"+rs.getString(5)+"\t\t\t\t\t"+rs.getInt(6)+"\t\t\t\t\t"+rs.getDouble(7));
            con.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

