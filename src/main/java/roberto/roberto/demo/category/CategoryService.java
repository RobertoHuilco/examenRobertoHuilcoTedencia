package roberto.roberto.demo.category;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    // Create
    public Categori save(Categori entity) {
        return categoryRepository.save(entity);
    }

    // select by id
    public Categori findById(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    // Delete
    public void deleteById(long id) {
        categoryRepository.deleteById(id);
    }

    // select all
    public List<Categori> findAll() {
        return categoryRepository.findAll();
    }

    // update by id
    public ResponseEntity<Categori> updateById(Long id, Categori categoryUpdate) {
        try {
            Categori categoryExisting = findById(id);
            if (categoryExisting == null) {
                return ResponseEntity.notFound().build();
            }
            // Update fields
            if (categoryUpdate.getName() != null) {
                categoryExisting.setName(categoryUpdate.getName());
            }
            if (categoryUpdate.getEnable() != null) {
                categoryExisting.setEnable(categoryUpdate.getEnable());
            }
            // Save the data
            Categori CategorySave = save(categoryExisting);
            // Return
            return ResponseEntity.ok(CategorySave);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
            // return ResponseEntity.status(HttpStatusCode)
        }
    }
}
