/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.controller;

import com.example.springtask6.model.ProductVariantAvailibleRecord;
import com.example.springtask6.service.ProductVariantAvailibleService;
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
public class ProductVariantAvailibleController {
@Autowired
private ProductVariantAvailibleService productVariantAvailibleService;     
@RequestMapping("/productvariantavailible")    
public List<ProductVariantAvailibleRecord> getAllProductsss()  
{    
return productVariantAvailibleService.getAllProductssss();    
}       
@RequestMapping(value="/add-productVariantAvailible", method=RequestMethod.POST)    
public void addProductVariantAvailible(@RequestBody ProductVariantAvailibleRecord productvariantavailiblerecord)  
{    
productVariantAvailibleService.addproductVariantAvailible(productvariantavailiblerecord);    
}       
}  

