package roberto.roberto.demo.surcursalroberto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SurcursalServiceRoberto {
    @Autowired
    private SurcursalRepositoryRoberto surcursalRepositoryRoberto;

    // // Create
    public SurcursalRoberto save(SurcursalRoberto entity) {
        return surcursalRepositoryRoberto.save(entity);
    }

    // // select by id
    public SurcursalRoberto findById(long id) {
        return surcursalRepositoryRoberto.findById(id).orElse(null);
    }

    // Delete
    public void deleteByName(String name) {
        surcursalRepositoryRoberto.deleteByName(name);
    }

    // select all
    public List<SurcursalRoberto> findAll() {
        return surcursalRepositoryRoberto.findAll();
    }

    // update by id
    public ResponseEntity<SurcursalRoberto> updateById(Long id, SurcursalRoberto surcursalUpdateRoberto) {
        try {
            SurcursalRoberto surcursalExistingRoberto = findById(id);
            if (surcursalExistingRoberto == null) {
                return ResponseEntity.notFound().build();
            }
            // Update fields
            if (surcursalUpdateRoberto.getName() != null) {
                surcursalExistingRoberto.setName(surcursalUpdateRoberto.getName());
            }
            if (surcursalUpdateRoberto.getDue_date() != null) {
                surcursalExistingRoberto.setDue_date(surcursalUpdateRoberto.getDue_date());
            }
            if (surcursalUpdateRoberto.getEnable() != null) {
                surcursalExistingRoberto.setEnable(surcursalUpdateRoberto.getEnable());
            }
            if (surcursalUpdateRoberto.getPrice() != null) {
                surcursalExistingRoberto.setPrice(surcursalUpdateRoberto.getPrice());
            }

            // Save the data
            SurcursalRoberto SurcursalSaveRoberto = save(surcursalExistingRoberto);
            // Return
            return ResponseEntity.ok(SurcursalSaveRoberto);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
            // return ResponseEntity.status(HttpStatusCode)
        }
    }
}
