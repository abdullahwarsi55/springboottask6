/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.controller;

import com.example.springtask6.model.ProductVariantRecord;
import com.example.springtask6.service.ProductVariantService;
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
public class ProductVariantController {
    @Autowired
private ProductVariantService productVariantService;     
@RequestMapping("/productvariant")    
public List<ProductVariantRecord> getAllProductss()  
{    
return productVariantService.getAllProductsss();    
}       
@RequestMapping(value="/add-productVariant", method=RequestMethod.POST)    
public void addProductVariant(@RequestBody ProductVariantRecord productvariantrecord)  
{    
productVariantService.addproductVariant(productvariantrecord);    
}       
}  

