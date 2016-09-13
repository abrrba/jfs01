package hello;

public class Product {

    private final long id;
    private final String content;

    public Product(long id, String content) {
        this.id = id;
        this.content = content + "Product";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
