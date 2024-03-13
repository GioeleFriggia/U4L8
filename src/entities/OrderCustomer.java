package entities;

public class OrderCustomer {
    private long id;
    private String name;
    private Integer tier;

    public OrderCustomer(long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Integer getTier() {
        return tier;
    }
}