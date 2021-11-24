package by.kishko.storeschain.Controller;

import by.kishko.storeschain.Model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ProductControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ProductsController productsController;

    @Test
    public void getAllProducts() throws Exception{
        Product product = new Product();
        product.setProductId(1);

        List<Product> productList = Collections.singletonList(product);

        given(productsController.getProducts()).willReturn(productList);

        mvc.perform(get("/{1}")
                        .contentType("Application/json"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", org.hamcrest.collection.IsCollectionWithSize.hasSize(1)))
                .andExpect(jsonPath("$[0].id", is(product.getProductId())));
    }

    @Test
    public void getProductById() throws Exception{
        Product product = new Product();
        product.setProductId(12);
        product.setName("Moloko");

        given(productsController.getProductById(product.getProductId()))
                .willReturn(product);

        mvc.perform(get("/products/{12}").contentType("Application/json"))
                .andExpect(status().isOk())
                .andExpect(jsonPath(String.valueOf(12), is(product.getProductId())));
    }
}
