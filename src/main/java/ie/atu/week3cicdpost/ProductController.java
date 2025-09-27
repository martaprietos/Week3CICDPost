package ie.atu.week3cicdpost;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")//all requests that come in with product should go here
@RestController //listens for requests
public class ProductController {

    @GetMapping("/getproduct")//view product
    public Product getProduct() {
        Product myProduct = new Product("TV", 499);
        return myProduct;
    }
}

