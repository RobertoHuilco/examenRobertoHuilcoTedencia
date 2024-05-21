package roberto.roberto.demo.supplier;


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
@RequestMapping("/api/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    // create
    @PostMapping("/")
    public Supplier save(@RequestBody Supplier entity) {
        return supplierService.save(entity);
    }

    // select by id
    @GetMapping("/{id}/")
    public Supplier findById(@PathVariable long id) {
        return supplierService.findById(id);
    }

    // Api update
    @PutMapping("/")
    public Supplier update(@RequestBody Supplier entity) {
        return supplierService.save(entity);
    }

    // Api Delete
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        supplierService.deleteById(id);
    }

    // read all
    @GetMapping("/")
    public List<Supplier> findAll() {
        return supplierService.findAll();
    }

    // Update by id
    @PutMapping(value = "/{id}")
    public ResponseEntity<Supplier> updateById(@PathVariable Long id, @RequestBody Supplier entity) {
        return supplierService.updateById(id, entity);
    }
}
