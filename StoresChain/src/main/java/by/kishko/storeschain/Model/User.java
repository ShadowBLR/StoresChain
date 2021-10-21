package by.kishko.storeschain.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name ="User")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
    private String nameFirst;
    private String nameLast;
    private Date   registrationTime;
    private String email;
    private int     userTypeId;
}
