/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.service;

/**
 *
 * @author admin
 */
import java.util.List;    
import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;  
import com.example.springtask6.model.ProductRecord;  
import com.example.springtask6.repository.ProductRepository;    
@Service    
public class ProductService   
{    
@Autowired    
private ProductRepository productRepository;    
public List<ProductRecord> getAllProducts()  
{    
List<ProductRecord>productRecords = new ArrayList<>();    
productRepository.findAll().forEach(productRecords::add);    
return productRecords;    
}    
public void addproduct(ProductRecord productrecord)  
{    
productRepository.save(productrecord);    
}    

} 
