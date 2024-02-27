import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class CompanyRepository {
    Map<String, String> env = System.getenv();
    String dbUser = env.get("DB_USER");
    String dbHost = env.get("DB_HOST");
    String dbPassword = env.get("DB_PASSWORD");

    public void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        try (Connection con = DriverManager.getConnection("jdbc:postgresql://" + dbHost + ":5432/stocks", dbUser, dbPassword)) {
            String tableSql = "CREATE TABLE IF NOT EXISTS company"
                    + "(id SERIAL PRIMARY KEY, name TEXT,"
                    + " country TEXT, creation_date DATE, stocks_count INT)";
            try (PreparedStatement stmt = con.prepareStatement(tableSql)) {
                stmt.execute();
            }
        }
    }

}
