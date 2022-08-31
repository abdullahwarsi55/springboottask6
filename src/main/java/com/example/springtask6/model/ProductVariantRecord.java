/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class ProductVariantRecord {   
@Id    
private int id;    
private String name;    
private String description; 
private int product_id;   
@OneToMany( targetEntity=ProductRecord.class )
    private List productRecordlist;
public ProductVariantRecord(int id, String name, String description ,int product_id) {
      super( );
      this.id = id;
      this.name = name;
      this.description = description;
this.product_id = product_id;
   }   
   
public ProductVariantRecord()  
{  
    super();
}    
public int getId()   
{    
return id;    
}    
public void setId(int id)   
{    
this.id = id;    
}    
public String getName()   
{    
return name;    
}    
public void setName(String name)   
{    
this.name = name;    
}    
public String getDescription()   
{    
return description;    
}    
public void setDescription(String description)   
{  
this.description = description;    
}  
 public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
        public List getProdcutRecordlist() {
      return productRecordlist;
    }

   public void setProductRecordlist(List productRecordlist) {
      this.productRecordlist = productRecordlist;
   }
} 

