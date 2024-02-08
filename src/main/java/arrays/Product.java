package arrays;
class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;

    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Product otherProduct) {
        // Compare products based on their price
        if (this.price < otherProduct.getPrice()) {
            return -1;
        } else if (this.price > otherProduct.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
    }
}