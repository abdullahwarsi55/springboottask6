/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.controller;

import com.example.springtask6.model.ProductRecord;
import com.example.springtask6.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */
@RestController    
public class ProductController   
{    
  @Autowired
private ProductService productService;     
@RequestMapping("/product")    
public List<ProductRecord> getAllProduct()  
{    
return productService.getAllProducts();    
}       
@RequestMapping(value="/add-product", method=RequestMethod.POST)    
public void addProduct(@RequestBody ProductRecord productrecord)  
{    
productService.addproduct(productrecord);    
}       
}    
