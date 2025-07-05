import java.sql.*;
class DriverConnection
{
    public static void main(String args[])
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver Registered....");
        Connection con = DriverManager.getConnection("jdbc.oracle:thin:@localhost:1521:XE","system","mange");
        System.out.println("COnnetion Created......");

        DataBaseMetaData dm = con.getMetaData();
        System.out.println(
            "\n The data base Details :\n"+
            "\nThe RDBMS name :\t" +
            dm.getDatabaseProductName()+
            "\nThe driver name :\t" +
            dm.getDriverName(); +
            "\nThe Driver Version :\t"+
            dm.getDriverVersion() +
            "\nThe Keys Words :\n\t" +
            dm.getSQLKeywords() 
        );

        

    }
}