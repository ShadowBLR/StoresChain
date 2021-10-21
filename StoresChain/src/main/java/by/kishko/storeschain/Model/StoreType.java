package by.kishko.storeschain.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="StoreType")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StoreType extends BaseEntity{
    private String Name;
}
