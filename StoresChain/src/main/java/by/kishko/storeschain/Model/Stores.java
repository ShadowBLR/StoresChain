package by.kishko.storeschain.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stores {
    private int id;
    private String name;
    private String address;
    private int size;
}
