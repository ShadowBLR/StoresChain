package by.kishko.storeschain.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StoreProduct {

  @Id
  private long storeId;
  private long productId;


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

}
