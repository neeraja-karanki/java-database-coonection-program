

import java.sql.*;
import java.util.*;
class First
{
public static void main(String args[]) throws ClassNotFoundException
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@shivababa:1521:xe","system","jyothi");
Statement st = con.createStatement();
String sql="select * from student";
st.executeUpdate(sql);
}
catch (SQLException e) {
         e.printStackTrace();
      }

    }

}
