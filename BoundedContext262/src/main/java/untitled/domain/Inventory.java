package untitled.domain;

import untitled.BoundedContext262Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Inventory_table")
@Data

public class Inventory  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private Integer price;
    
    
    
    
    
    private Integer qty;


    public static InventoryRepository repository(){
        InventoryRepository inventoryRepository = BoundedContext262Application.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }






}
