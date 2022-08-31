/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.example.springtask6.model.ProductRecord;
import java.util.List;
import javax.persistence.OneToMany;
/**
 *
 * @author admin
 */
@Entity
public class ProductReviewRecord {   
@Id    
private int id;    
private String name;    
private String content; 
private int product_id;   
@OneToMany( targetEntity=ProductRecord.class )
    private List productRecordlist;
   
public ProductReviewRecord()  
{  
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
public String getContent()   
{    
return content;    
}    
public void setContent(String content)   
{  
this.content = content;    
}  
 public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int content_id) {
        this.product_id = content_id;
    }
 public List getProdcutRecordlist() {
      return productRecordlist;
    }

   public void setProductRecordlist(List productRecordlist) {
      this.productRecordlist = productRecordlist;
   }
} 
