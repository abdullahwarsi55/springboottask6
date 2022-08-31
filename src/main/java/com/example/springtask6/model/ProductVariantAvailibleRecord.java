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
public class ProductVariantAvailibleRecord {
@Id    
private int id;    
private String s_num;    
private String p_variantid; 
private int product_id;   
@OneToMany( targetEntity=ProductRecord.class )
    private List productRecordlist;
@OneToMany( targetEntity=ProductVariantRecord.class )
    private List productVariantRecordlist;   
public ProductVariantAvailibleRecord()  
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
public String getS_num()   
{    
return s_num;    
}    
public void setS_num(String s_num)   
{    
this.s_num = s_num;    
}    
public String getP_variantid()   
{    
return p_variantid;    
}    
public void setP_variantid(String p_variantid)   
{  
this.p_variantid = p_variantid;    
}  
 public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
     public List getProductRecordlist() {
      return productRecordlist;
    }

   public void setProductRecordlist(List productRecordlist) {
      this.productRecordlist = productRecordlist;
   }
      public List getProductVariantRecordlist() {
      return productVariantRecordlist;
    }

   public void setProductVariantRecordlist(List productVariantRecordlist) {
      this.productVariantRecordlist = productVariantRecordlist;
   }
} 

