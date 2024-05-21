package roberto.roberto.demo.surcursalroberto;

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
@RequestMapping("/api/sursscursal")
public class SurcursalControllerRoberto {
    @Autowired
    private SurcursalServiceRoberto surcursalServiceRoberto;

    // // create
    @PostMapping("/")
    public SurcursalRoberto save(@RequestBody SurcursalRoberto entity) {
        return surcursalServiceRoberto.save(entity);
    }

    // // select by id
    @GetMapping("/{id}/")
    public SurcursalRoberto findById(@PathVariable long id) {
        return surcursalServiceRoberto.findById(id);
    }

    // Api update
    @PutMapping("/")
    public SurcursalRoberto update(@RequestBody SurcursalRoberto entity) {
        return surcursalServiceRoberto.save(entity);
    }
    // Api Delete
    @DeleteMapping("/{name}/")
    public void deleteByName(@PathVariable String name) {
    surcursalServiceRoberto.deleteByName(name);
    }

    // read all
    @GetMapping("/")
    public List<SurcursalRoberto> findAll() {
        return surcursalServiceRoberto.findAll();
    }

    // // Update by id
    @PutMapping(value = "/{id}")
    public ResponseEntity<SurcursalRoberto> updateById(@PathVariable Long id, @RequestBody SurcursalRoberto entity) {
        return surcursalServiceRoberto.updateById(id, entity);
    }
}
