/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.controller;

import com.example.springtask6.model.ProductReviewRecord;
import com.example.springtask6.service.ProductReviewService;
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
public class ProductReviewController   
{  
    @Autowired
private ProductReviewService productReviewService;     
@RequestMapping("/productreview")    
public List<ProductReviewRecord> getAllProducts()  
{    
return productReviewService.getAllProductss();    
}       
@RequestMapping(value="/add-productReview", method=RequestMethod.POST)    
public void addProductReview(@RequestBody ProductReviewRecord productreviewrecord)  
{    
productReviewService.addproductReview(productreviewrecord);    
}       
} 
