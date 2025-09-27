package ie.atu.week3cicdpost;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")//all requests that come in with product should go here
@RestController //listens for requests
public class ProductController {

    List<Product> myList = new ArrayList<Product>(); //create array list
    @GetMapping("/getproducts")//view product
    public List<Product> getProducts() {
        Product myProduct = new Product("TV", 499);
        return myList;
    }

    @PostMapping("/addproduct")
    public Product addProduct( @Valid @RequestBody Product myProduct) { //create new instance of product, use validation in Product class, do not add if invalid
        myList.add(myProduct); //add each product to the list
        return myProduct;
    }
}

