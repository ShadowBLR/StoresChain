package by.kishko.storeschain.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  private long postId;
  private String name;


  public long getPostId() {
    return postId;
  }

  public void setPostId(long postId) {
    this.postId = postId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
