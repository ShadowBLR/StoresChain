package by.kishko.storeschain.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {

  @Id
  private long productId;
  private String vendorCode;
  private String name;
  private String price;
  private String description;
  @ManyToOne
  private Departement departement;
  @ManyToMany
  private Set<Store> stores;

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Departement getDepartement() {
    return departement;
  }

  public void setDepartement(Departement departement) {
    this.departement = departement;
  }

}
