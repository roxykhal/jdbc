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
        String sql ="delete from student where sid=5";

        //load and register
        Class.forName("org.postgresql.Driver");

       /* Statement object allows you to send sql queries to database, st.executeQuery(sql) executes the query contained in the sql string.
        Result of this query is a set of data(resultset) that is returned and stored in the rs variable. */
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection established");

        //create statement
        Statement st = con.createStatement();

        boolean status = st.execute(sql);
        System.out.println(status);


        //close a connection
        con.close();
        System.out.println("Connection closed");



        }



    }

