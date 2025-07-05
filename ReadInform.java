import java.sql.*;
import java.io.*;

class ReadInform
{
    public static void main(String args[])

    {
        Class.forName("orcale.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mange");
        Statement st = con.createStatement();
        BufferReader buf = new BufferReader(new InputStreamReader(System.in));
        System.out.println("\nEnter Query String :");
        String qry = buf.readLine();
        ResultSet rs = st.executedQuery(qry);
        ResultSetMetaData rsmd = rs.getMetaData();
        String head = "";
        for(int i=1;i<rsmd.getColunmCount();i++)
        {
            head+=rsmd.getColunmName(i)+"\t";
        }
        System.out.println(head);
        System.out.println("==================================================");
        while(rs.next())
        {
            String row="";
            for(int i=1;i<rmsd.getColunmCount();i++)
            {
                row+=rs.getString(i)+"\t";
            }
            System.out.println(row);
        }
    }
}