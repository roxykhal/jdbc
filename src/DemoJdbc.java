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

        int sid = 102;
        String sname = "Jasmine";
        int marks = 22;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Ladysmithroad123";
        String sql ="insert into student values (?,?,?)";

        //load and register
        Class.forName("org.postgresql.Driver");

       /* Statement object allows you to send sql queries to database, st.executeQuery(sql) executes the query contained in the sql string.
        Result of this query is a set of data(resultset) that is returned and stored in the rs variable. */
        Connection con = DriverManager.getConnection(url,uname,pass);

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

        st.execute();

        //close a connection
        con.close();
        System.out.println("Connection closed");



        }



    }

