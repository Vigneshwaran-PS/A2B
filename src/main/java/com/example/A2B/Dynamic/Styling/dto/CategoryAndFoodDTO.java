package com.example.A2B.Dynamic.Styling.dto;

import com.example.A2B.Dynamic.Styling.entity.Food;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryAndFoodDTO {


    private String categoryName;

    private List<Food> foods;
}
