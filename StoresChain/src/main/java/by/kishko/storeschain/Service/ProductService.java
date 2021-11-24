package by.kishko.storeschain.Service;

import by.kishko.storeschain.Model.Product;
import by.kishko.storeschain.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService implements IProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> FindALl() {
        return (List<Product>) productRepository.findAll();
    }
}
