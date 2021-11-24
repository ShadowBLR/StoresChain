package by.kishko.storeschain.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

  @Id
  private long employeeId;
  private String nameFirst;
  private String nameLast;
  private String gender;
  private java.sql.Date dateOfBirth;
  @ManyToOne
  private Store store;
  @ManyToOne
  private Post post;


  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }


  public String getNameFirst() {
    return nameFirst;
  }

  public void setNameFirst(String nameFirst) {
    this.nameFirst = nameFirst;
  }


  public String getNameLast() {
    return nameLast;
  }

  public void setNameLast(String nameLast) {
    this.nameLast = nameLast;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public java.sql.Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(java.sql.Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }


  public Post getPostId() {
    return post;
  }

  public void setPostId(Post post) {
    this.post = post;
  }

}
