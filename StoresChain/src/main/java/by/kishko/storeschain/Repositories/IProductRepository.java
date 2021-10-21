package by.kishko.storeschain.Repositories;

import by.kishko.storeschain.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
    Product deleteByName(String name);
}
