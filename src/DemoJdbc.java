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


        //load and register
        Class.forName("org.postgresql.Driver");

        //create connection
        Connection con = DriverManager.getConnection(url,uname,pass);





    }
}
