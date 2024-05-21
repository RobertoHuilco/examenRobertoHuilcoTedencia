package roberto.roberto.demo.category;

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
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    // create
    @PostMapping("/")
    public Categori save(@RequestBody Categori entity) {
        return categoryService.save(entity);
    }

    // select by id
    @GetMapping("/{id}/")
    public Categori findById(@PathVariable long id) {
        return categoryService.findById(id);
    }

    // Api update
    @PutMapping("/")
    public Categori update(@RequestBody Categori entity) {
        return categoryService.save(entity);
    }

    // Api Delete
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id) {
        categoryService.deleteById(id);
    }

    // read all
    @GetMapping("/")
    public List<Categori> findAll() {
        return categoryService.findAll();
    }

    // Update by id
    @PutMapping(value = "/{id}")
    public ResponseEntity<Categori> updateById(@PathVariable Long id, @RequestBody Categori entity) {
        return categoryService.updateById(id, entity);
    }
}
