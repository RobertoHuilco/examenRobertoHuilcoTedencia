package roberto.roberto.demo.supplier;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    // Create
    public Supplier save(Supplier entity) {
        return supplierRepository.save(entity);
    }

    // select by id
    public Supplier findById(long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    // Delete
    public void deleteById(long id) {
        supplierRepository.deleteById(id);
    }

    // select all
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    // update by id
    public ResponseEntity<Supplier> updateById(Long id, Supplier supplierUpdate) {
        try {
            Supplier supplierExisting = findById(id);
            if (supplierExisting == null) {
                return ResponseEntity.notFound().build();
            }
            // Update fields
            if (supplierUpdate.getName() != null) {
                supplierExisting.setName(supplierUpdate.getName());
            }
            if (supplierUpdate.getPhone() != null) {
                supplierExisting.setPhone(supplierUpdate.getPhone());
            }
            if (supplierUpdate.getAddress() != null) {
                supplierExisting.setAddress(supplierUpdate.getAddress());
            }
            // Save the data
            Supplier SupplierSave = save(supplierExisting);
            // Return
            return ResponseEntity.ok(SupplierSave);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
            // return ResponseEntity.status(HttpStatusCode)
        }
    }
}
