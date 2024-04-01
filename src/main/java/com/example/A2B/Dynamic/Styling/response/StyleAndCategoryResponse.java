package com.example.A2B.Dynamic.Styling.response;

import com.example.A2B.Dynamic.Styling.dto.CategoryAndFoodDTO;
import com.example.A2B.Dynamic.Styling.entity.Style;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class StyleAndCategoryResponse {

    private Style style;

    private List<CategoryAndFoodDTO> categoryAndFoodDTOS;
}
