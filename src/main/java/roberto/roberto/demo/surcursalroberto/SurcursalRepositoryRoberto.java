package roberto.roberto.demo.surcursalroberto;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SurcursalRepositoryRoberto extends CrudRepository<SurcursalRoberto, Long> {
    List<SurcursalRoberto> findAll();
    void deleteByName(String name);
}
