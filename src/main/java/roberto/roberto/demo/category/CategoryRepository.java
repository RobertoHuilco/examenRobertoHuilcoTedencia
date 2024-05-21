package roberto.roberto.demo.category;


import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Categori, Long> {
    List<Categori> findAll();
}