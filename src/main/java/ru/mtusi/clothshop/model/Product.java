package ru.mtusi.clothshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends AbstactBaseEntity{

    @NotBlank


    private String category;
    @NotBlank
    private String sex;
    @NotBlank
    private String brand;
    @NotBlank
    private String color;
    @NotBlank
    private String size;
    @NotNull
    private Integer price;
    @NotNull
    private Integer quantity;
}

