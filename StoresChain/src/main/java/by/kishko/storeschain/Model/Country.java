package by.kishko.storeschain.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Country")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Country extends BaseEntity{
    private String name;
}
