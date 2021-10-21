package by.kishko.storeschain.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name ="Employee")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends BaseEntity {
    private String nameFirst;
    private String nameLast;
    private Character gender;
    private Date DateOfBirth;
    private Long StoreId;
}
