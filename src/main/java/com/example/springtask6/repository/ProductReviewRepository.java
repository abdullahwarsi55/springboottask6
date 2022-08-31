/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.repository;
/**
 *
 * @author admin
 */
import org.springframework.data.repository.CrudRepository;  
import com.example.springtask6.model.ProductReviewRecord;    
public interface ProductReviewRepository extends CrudRepository<ProductReviewRecord, String>   
{    
} 
