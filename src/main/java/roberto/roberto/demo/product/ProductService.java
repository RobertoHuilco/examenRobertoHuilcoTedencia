package roberto.roberto.demo.product;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Create
    public Product save(Product entity) {
        return productRepository.save(entity);
    }

    // select by id
    public Product findById(long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Delete
    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    // select all
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // update by id
    public ResponseEntity<Product> updateById(Long id, Product productUpdate) {
        try {
            Product productExisting = findById(id);
            if (productExisting == null) {
                return ResponseEntity.notFound().build();
            }
            // Update fields
            if (productUpdate.getName() != null) {
                productExisting.setName(productUpdate.getName());
            }
            if (productUpdate.getDue_date() != null) {
                productExisting.setDue_date(productUpdate.getDue_date());
            }
            // Save the data
            Product ProductSave = save(productExisting);
            // Return
            return ResponseEntity.ok(ProductSave);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
            // return ResponseEntity.status(HttpStatusCode)
        }
    }
}
