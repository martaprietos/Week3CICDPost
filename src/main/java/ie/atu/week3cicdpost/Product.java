package ie.atu.week3cicdpost;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //generates getters, setters, toString etc
@AllArgsConstructor //constructor for all arguments/data
public class Product {
    @NotBlank //make sure name is not blank
    private String productName;
    @Positive //make sure price is positive
    private double price;
}
