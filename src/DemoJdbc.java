import java.sql.*;

public class DemoJdbc {

    public static void main(String[] args) throws Exception {

        /*
        import package
        load and register
        create connection - connect application to DB
        create statement
        execute statement
        process results
        close
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Ladysmithroad123";
        String sql ="select sname from student where sid = 1";

        //st is a reference object for statement


        //load and register
        Class.forName("org.postgresql.Driver");

       /* Statement object allows you to send sql queries to database, st.executeQuery(sql) executes the query contained in the sql string. Result of this query is a set of data(resultset) that is returned and stored in the rs variable. */
        Connection con = DriverManager.getConnection(url,uname,pass);

        //create statement
        Statement st = con.createStatement();

        /* Statement object allows you to send sql queries to database, st.executeQuery(sql) executes the query contained in the sql string. Result of this query is a set of data(resultset) that is returned and stored in the rs variable. */
        ResultSet rs = st.executeQuery(sql);

        //process results - will tell you if there is another row in the database(will print true)
        System.out.println(rs.next());

        System.out.println("Connection established");

        //create statement






    }
}
