package by.kishko.storeschain.Exception;

public class ProductNotFoundException extends Exception {
    private long productId;

    public ProductNotFoundException(long productId) {
        super(String.format("Product is not found with id : '%s'", productId));
    }
}
