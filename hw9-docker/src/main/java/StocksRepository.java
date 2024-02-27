
import java.sql.*;
import java.util.Map;

public class StocksRepository {
    static Map<String, String> env = System.getenv();
    static String dbUser = env.get("DB_USER");
    static String dbHost = env.get("DB_HOST");
    static String dbPassword = env.get("DB_PASSWORD");

    public void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        try (Connection con = DriverManager.getConnection("jdbc:postgresql://" + dbHost + ":5432/stocks", dbUser, dbPassword)) {
                String tableSql = "CREATE TABLE IF NOT EXISTS stocks"
                        + "(id SERIAL PRIMARY KEY, name TEXT,"
                        + " cost INT, company_id BIGINT)";
            try (PreparedStatement stmt = con.prepareStatement(tableSql)) {
                stmt.execute();
            }
        }
    }

    public static void create(StocksEntity entity) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        try (Connection con = DriverManager.getConnection("jdbc:postgresql://" + dbHost + ":5432/stocks", dbUser, dbPassword)) {
            String insertSql = "INSERT INTO stocks(name, cost, company_id)"
                    + " VALUES(?,?,?)";
            try (PreparedStatement stmt = con.prepareStatement(insertSql)) {
                stmt.setString(1,entity.name());
                stmt.setInt(2,entity.cost());
                stmt.setInt(3,entity.company_id());
                stmt.executeUpdate();
            }
        }
    }
}
