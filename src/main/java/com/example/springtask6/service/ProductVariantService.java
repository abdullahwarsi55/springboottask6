/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.service;

import com.example.springtask6.model.ProductVariantRecord;
import com.example.springtask6.repository.ProductVariantRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ProductVariantService {
    
@Autowired    
private ProductVariantRepository productVariantRepository;    
public List<ProductVariantRecord> getAllProductsss()  
{    
List<ProductVariantRecord>productVariantRecords = new ArrayList<>();    
productVariantRepository.findAll().forEach(productVariantRecords::add);    
return productVariantRecords;    
}    
public void addproductVariant(ProductVariantRecord productvariantrecord)  
{    
productVariantRepository.save(productvariantrecord);    
}    
}
