/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.service;

import com.example.springtask6.model.ProductReviewRecord;
import com.example.springtask6.repository.ProductReviewRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ProductReviewService {
    
@Autowired    
private ProductReviewRepository productReviewRepository;    
public List<ProductReviewRecord> getAllProductss()  
{    
List<ProductReviewRecord>productReviewRecords = new ArrayList<>();    
productReviewRepository.findAll().forEach(productReviewRecords::add);    
return productReviewRecords;    
}    
public void addproductReview(ProductReviewRecord productreviewrecord)  
{    
productReviewRepository.save(productreviewrecord);    
}    
} 
    
