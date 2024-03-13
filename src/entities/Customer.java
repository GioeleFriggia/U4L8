
package entities;


public class Customer {
    private long id; // ID del cliente
    private String name; // Nome del cliente
    private Integer tier; // Livello del cliente

    // Costruttore per inizializzare un oggetto Customer con i dati forniti
    public Customer(long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    // Metodo getter per ottenere il livello del cliente
    public Integer getTier() {
        return tier;
    }
}
