/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.persona.demo.services;
import com.persona.demo.entity.Product;
import com.persona.demo.repository.ProductRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anthony
 */
@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductRepository repo;
    
    public List<Product> listAll() {
        return repo.findAll();
    }
    
    public void save(Product product){
        repo.save(product);
    }
    
    public Product get(long id){
        return repo.findById(id).get();
    }
    
    public void delete(long id){
        repo.deleteById(id);
    }
}
