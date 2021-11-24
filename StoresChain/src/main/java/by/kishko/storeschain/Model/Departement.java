package by.kishko.storeschain.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departement {

  @Id
  private long departementId;
  private String name;


  public long getDepartementId() {
    return departementId;
  }

  public void setDepartementId(long departementId) {
    this.departementId = departementId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
