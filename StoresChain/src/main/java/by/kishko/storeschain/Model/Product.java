package by.kishko.storeschain.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Products")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity{
    private String vendorCode;
    private String name;
    private int category;
    private double price;
    private String description;
}
