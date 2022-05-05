package com.jumperro.git.ShoppingList.Product;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter @Setter
@Entity
@Table(name = "LIST")
public class Product {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private int id;
    private String name;
    private int amount;
    @NotBlank @NotNull(message = "select one from: piece, pieces, litre, litres, kilo, kilos")
    private String type;

    public Product() {
    }

    public void update(Product toUpdate){
        this.name = name;
        this.amount = amount;
        this.type = type;
    }
}
