package ie.atu.week3cicdpost;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data //generates getters, setters, toString etc
@AllArgsConstructor //constructor for all arguments/data
public class Product {
    private String productName;
    private double price;
}
