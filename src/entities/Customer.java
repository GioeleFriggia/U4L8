// entities/Customer.java
package entities;

public class Customer {
    private long id;
    private String name;
    private Integer tier;

    public Customer(long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Integer getTier() {
        return tier;
    }
}
