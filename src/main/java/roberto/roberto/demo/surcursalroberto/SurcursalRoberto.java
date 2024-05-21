package roberto.roberto.demo.surcursalroberto;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import roberto.roberto.demo.category.Categori;

@Entity
@Data
public class SurcursalRoberto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Date due_date;
    private Boolean enable;
    private Float price;
    @ManyToOne
    private Categori category;
}
