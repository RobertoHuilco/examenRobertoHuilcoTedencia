package roberto.roberto.demo.product;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import roberto.roberto.demo.category.Categori;
import roberto.roberto.demo.supplier.Supplier;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Date due_date;
    @ManyToOne
    private Categori categori;
    @ManyToOne
    private Supplier supplier;
}
