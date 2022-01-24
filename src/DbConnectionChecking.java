//To Display Records
//Vendra And Saanvi
import java.sql.*;
public class DbConnectionChecking {

        public static void main(String args[]) throws ClassNotFoundException
        {

            try
            {

                String databaseName = "eventmanagement_db";
                String databaseUser = "root";
                String databasePass = "";

                String url = "jdbc:mysql://localhost:3306/" + databaseName;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection databaselink= DriverManager.getConnection(url,databaseUser,databasePass);
                System.out.println("\n\nConnected");
                System.out.println("\n");
                Statement st=databaselink.createStatement();
                ResultSet rs=st.executeQuery("select * from event_staffs");
                System.out.println("Ename\t\t\t\t\tEDOB\t\t\t\t\tEPost\t\t\t\t\tEStaffid\t\t\t\t\tEAddress\t\t\t\t\tYearsOfExperience\t\t\t\t\tSalary");
                while(rs.next())
                {
                    System.out.println(rs.getString(1)+"\t\t\t\t\t"+rs.getDate(2)+"\t\t\t\t\t"+rs.getString(3)+"\t\t\t\t\t"+rs.getInt(4)+"\t\t\t\t\t"+rs.getString(5)+"\t\t\t\t\t"+rs.getInt(6)+"\t\t\t\t\t"+rs.getDouble(7));
                }
            }  catch(SQLException s)
            {

            }
        }

    }
