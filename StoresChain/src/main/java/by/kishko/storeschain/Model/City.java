package by.kishko.storeschain.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City{

  @Id
  private long cityId;
  private String name;


  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
