/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.model;

import com.example.springtask6.controller.ProductController;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author admin
 */
@Entity    
public class ProductRecord   
{   
@Id    
private int id;    
private String name;    
private String description;
public ProductRecord(int id, String name, String description) {
      super( );
      this.id = id;
      this.name = name;
      this.description = description;

   }

public ProductRecord()  
{  
    super( );
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
  
}
