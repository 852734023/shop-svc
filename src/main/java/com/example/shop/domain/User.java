package com.example.shop.domain;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

@Entity
@Table(name="USERINFO")
public class User {

   @Id
   @Column(name="USERID")
   private String userId;
   @Column(name="USERNAME")
   private String userName;

   public String getUserId(){
      return userId;
   }
   public  void setUserId(String userId){
         this.userId = userId;
   }

   public String getUserName() {
      return userName;
   }
   public void setUserName(String userName) {
      this.userName = userName;
   }
}
