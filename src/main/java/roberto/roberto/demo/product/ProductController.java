package roberto.roberto.demo.product;


import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    // create
    @PostMapping("/")
    public Product save(@RequestBody Product entity) {
        return productService.save(entity);
    }

    // select by id
    @GetMapping("/{id}/")
    public Product findById(@PathVariable long id) {
        return productService.findById(id);
    }

    // Api update
    @PutMapping("/")
    public Product update(@RequestBody Product entity) {
        return productService.save(entity);
    }

    // Api Delete
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        productService.deleteById(id);
    }

    // read all
    @GetMapping("/")
    public List<Product> findAll() {
        return productService.findAll();
    }

    // Update by id
    @PutMapping(value = "/{id}")
    public ResponseEntity<Product> updateById(@PathVariable Long id, @RequestBody Product entity) {
        return productService.updateById(id, entity);
    }
}
