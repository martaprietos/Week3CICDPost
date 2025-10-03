package ie.atu.week3cicdpost;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //generates getters, setters, toString etc
@AllArgsConstructor //constructor for all arguments/data
public class Product {
    @NotBlank //make sure name is not blank
    @Size(min = 1, max = 100) //Product name must be between 1 and 100 characters
    private String productName;
    @Positive //make sure price is positive
    private double price;
}
