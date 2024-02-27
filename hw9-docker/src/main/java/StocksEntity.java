public class StocksEntity {
    String name;
    Integer cost;
    Integer company_id;

    public StocksEntity(String name, Integer cost, Integer company_id) {
        this.name = name;
        this.cost = cost;
        this.company_id = company_id;
    }

    public String name() {
        return "";
    }

    public int cost() {
        return 0;
    }

    public int company_id() {
        return 0;
    }
}
