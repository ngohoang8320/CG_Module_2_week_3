package arraylist_linkedlist;

public class Product {
    private static int countId;

    private int id;
    private String name;
    private double cost;

    public Product(String name,
                   double cost) {
        this.name = name;
        this.cost = cost;
        this.id = ++countId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", cost: " + cost;
    }
}
