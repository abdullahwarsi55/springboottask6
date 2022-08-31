/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.springtask6.repository;

/**
 *
 * @author admin
 */
import com.example.springtask6.model.ProductVariantAvailibleRecord;
import org.springframework.data.repository.CrudRepository;  
public interface ProductVariantAvailibleRepository extends CrudRepository<ProductVariantAvailibleRecord, String>   
{    
} 
