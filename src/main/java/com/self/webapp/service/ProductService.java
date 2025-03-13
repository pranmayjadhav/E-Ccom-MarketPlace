package com.self.webapp.service;

import com.self.webapp.model.Product;
import com.self.webapp.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    ProductRepo productRepo;
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Moto", 25000),
//            new Product(102, "Iphone", 50000),
//            new Product(103, "Nothing phone", 40000)));

    //GET Method
    public List<Product> getProducts() {
        return productRepo.findAll();
    }
    //GET Method
    public Product getPrductById(int prodid) {
//        for(Product p : products) {
//            if(p.getId() == prodid) {
//                return p;
//            }
//        }
//        return new Product(000, "No Product found", 0000);
        //Using Stream API
//        return products.stream()
//                .filter(p -> p.getId() == prodid)
//                .findFirst().orElse(new Product(000, "No Product found", 0000));
        return productRepo.findById(prodid).orElse(new Product(000, "No Product found", 0000));
    }

    //POST Method
    public void postProduct(Product p) {
        productRepo.save(p);
    }

    public void updateProduct(Product p) {
//        int index= 0;
//        for(int i = 0; i<products.size(); i++){
//            if(products.get(i).getId() == p.getId()){
//                index = i;
//            }
//        }
//        products.set(index, p);
        //Hibernate
        productRepo.save(p);

    }

    public void deleteProductById(int prodid) {
//        int index= 0;
//        for(int i = 0; i<products.size(); i++){
//            if(products.get(i).getId() == prodid){
//                index = i;
//            }
//        }
//        products.remove(index);
        productRepo.deleteById(prodid);
    }



}
