package by.kishko.storeschain.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Store")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Stores extends BaseEntity{
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private int size;

    @Column(nullable = true)
    private  Long storeTypeId = 0L;
    @Column(nullable = true)
    private  Long countryId = 0L;
}
