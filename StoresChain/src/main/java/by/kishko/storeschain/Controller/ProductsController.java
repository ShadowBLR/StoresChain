package by.kishko.storeschain.Controller;

import by.kishko.storeschain.Model.Product;
import by.kishko.storeschain.Exception.ProductNotFoundException;
import by.kishko.storeschain.Repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/products")
public class ProductsController {
    private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);
    @Autowired
    private ProductRepository productRepository;

    @GetMapping()
    public List<Product> getProducts(){
        logger.error("products");
        return (List<Product>) productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable(value = "id") Long productId) throws ProductNotFoundException {
        logger.error("products/"+productId);
        return productRepository.findById(productId)
                .orElseThrow(()->new ProductNotFoundException(productId));
    }

    @PostMapping("/{id}")
    public void addProduct(@PathVariable(value = "id") Long productId){
       logger.info("/products/add");
    }


}
