public class CompanyEntity {
    String name;
    String country;
    String date;
    Integer stocks_count;


    public CompanyEntity(String name, String country, String date, Integer stocks_count) {
        this.name = name;
        this.country = country;
        this.date = date;
        this.stocks_count = stocks_count;
    }

}
