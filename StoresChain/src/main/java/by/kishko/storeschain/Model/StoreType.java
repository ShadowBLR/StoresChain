package by.kishko.storeschain.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StoreType {
@Id
  private long storeTypeId;
  private String name;


  public long getStoreTypeId() {
    return storeTypeId;
  }

  public void setStoreTypeId(long storeTypeId) {
    this.storeTypeId = storeTypeId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
