import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "cost")
    private double cost;

    public Product() {
    }

    public Product(String title, double cost) {
        this.title=title;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Product:" +
                " id = " + id +
                ", title = '" + title + '\'' +
                ", coast = " + cost +
                ';';
    }

}


