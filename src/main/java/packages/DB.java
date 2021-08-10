package packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection conn() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection(
                "**DB_URL**",
                "**DB_USER**",
                "**DB_PASS**"
        );
    }
}
