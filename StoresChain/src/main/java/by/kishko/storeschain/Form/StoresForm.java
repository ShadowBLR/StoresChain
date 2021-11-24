package by.kishko.storeschain.Form;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StoresForm {
    private int id;
    private String name;
    private String address;
    private int size;
}
