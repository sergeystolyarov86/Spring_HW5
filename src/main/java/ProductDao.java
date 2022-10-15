import java.util.List;

public interface ProductDao {
    Product findById(Long id);

    List<Product> findAll();

    Product findByTitle(String title);

    void deleteById(Long id);

    void save(Product product);

    void update(Long id, String title);

}
