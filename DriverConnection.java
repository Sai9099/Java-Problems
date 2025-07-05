import java.sql.*;
class DriverConnection
{
    public static void main(String args[])
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver Registered....");
        Connection con = DriverManager.getConnection("jdbc.oracle:thin:@localhost:1521:XE","system","mange");
        System.out.println("COnnetion Created......");

    }
}