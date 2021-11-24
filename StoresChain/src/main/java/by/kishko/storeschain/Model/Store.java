package by.kishko.storeschain.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class Store {

  @Id
  private long storeId;
  private String name;
  private String address;
  @ManyToOne
  private StoreType storeType;
  @ManyToOne
  private City city;
  @ManyToMany
  private Set<Product> products;


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public StoreType getStoreType() {
    return storeType;
  }

  public void setStoreTypeId(StoreType storeType) {
    this.storeType = storeType;
  }


  public City getCity() {
    return city;
  }

  public void setCityId(City city) {
    this.city = city;
  }

}
