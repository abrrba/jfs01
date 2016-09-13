package hello;

public class Products {

    private int x;
    private long id [];
    private String content[];
    // private ProductRecord array [];
    private int array [];

    public Products(String a) {
       // array = new ProductRecord[10];

       // for (int i =0; i < 10; i++) {
       //     array[i].id = i;
       //     array[i].name = "Product " + Integer.toString(i);
       // }
    }

    public Products () {
        this.x  =10;
        this.id = new long[2];
        this.content = new String [2];
        // this.array = new ProductRecord[10];
        this.array = new int [10];
        
        id[0] = 0;
        id[1] = 1;
        content[0] = "Hello";
        content[1] = "World";

//        array[0] = 10;

       // for (int i = 0; i < 10; i++) {
       //     array[0].id = i;
       //     array[0].name = "Product " ; //+ Integer.toString(i);
       // }
    }

    public long [] getId() {
        return id;
    }

    public String [] getContent() {
        return content;
    }
}
