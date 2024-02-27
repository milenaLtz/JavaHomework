import java.sql.SQLException;

public class TestMain {
//    CompanyRepository companyRepository = new CompanyRepository();
//    CompanyEntity companyEntity = new CompanyEntity("merci", "armenia", "09-12-2022", 24);
public static void main(String[] args) throws SQLException, ClassNotFoundException {
    StocksRepository stocksRepository = new StocksRepository();
    StocksEntity stocksEntity = new StocksEntity("first", 23, 1);
    StocksRepository.create(stocksEntity);
}
//    StocksRepository stocksRepository = new StocksRepository();
//    StocksEntity stocksEntity = new StocksEntity("first", 23, 1);
}
