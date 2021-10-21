package by.kishko.storeschain.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="UserType")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserType extends BaseEntity{
    private String name;
}
