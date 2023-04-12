public class Product {
    private String toy;

    public Product(String toy) {
        this.toy = toy;
    }

    public Product() {
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Product{" +
                "toy='" + toy + '\'' +
                '}';
    }
}
