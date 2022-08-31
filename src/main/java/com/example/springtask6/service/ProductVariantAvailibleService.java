/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.service;

import com.example.springtask6.model.ProductVariantAvailibleRecord;
import com.example.springtask6.repository.ProductVariantAvailibleRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ProductVariantAvailibleService {
   
@Autowired    
private ProductVariantAvailibleRepository productVariantAvailibleRepository;    
public List<ProductVariantAvailibleRecord> getAllProductssss()  
{    
List<ProductVariantAvailibleRecord>productVariantAvailibleRecords = new ArrayList<>();    
productVariantAvailibleRepository.findAll().forEach(productVariantAvailibleRecords::add);    
return productVariantAvailibleRecords;    
}    
public void addproductVariantAvailible(ProductVariantAvailibleRecord productvariantavailiblerecord)  
{    
productVariantAvailibleRepository.save(productvariantavailiblerecord);    
}    
}

