package com.self.webapp.controller;

import com.self.webapp.model.Product;
import com.self.webapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    //Dependancy Injection (field)
//    @Autowired
      ProductService productService;

    //Dependancy Injection (constructor)
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getproducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{prodid}")
    public Product getProductById(@PathVariable int prodid) {
        Product p = productService.getPrductById(prodid);
        return p;
    }

    @PostMapping("/products")
    public void postProduct(@RequestBody Product p) {
        productService.postProduct(p);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product p) {
        productService.updateProduct(p);
    }

    @DeleteMapping("/products/{prodid}")
    public void deletePrductById(@PathVariable int prodid) {
        productService.deleteProductById(prodid);
    }
}
