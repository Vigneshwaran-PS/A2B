package com.example.A2B.Dynamic.Styling.controller;

import com.example.A2B.Dynamic.Styling.dto.CategoryAndFoodDTO;
import com.example.A2B.Dynamic.Styling.response.StyleAndCategoryResponse;
import com.example.A2B.Dynamic.Styling.entity.Category;
import com.example.A2B.Dynamic.Styling.entity.Food;
import com.example.A2B.Dynamic.Styling.entity.Food_And_Category;
import com.example.A2B.Dynamic.Styling.entity.Style;
import com.example.A2B.Dynamic.Styling.service.CategoryService;
import com.example.A2B.Dynamic.Styling.service.Food_And_Category_Service;
import com.example.A2B.Dynamic.Styling.service.StyleService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app.magilhub.com/restaurant")
public class MainController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private Food_And_Category_Service foodAndCategoryService;

    @Autowired
    private StyleService styleService;


    @GetMapping("/{province}")
    public ResponseEntity<StyleAndCategoryResponse> getAllCategoriesAndFood(@PathVariable("province") String province){

        Style style = styleService.getStyleByProvince(province);

        List<Food_And_Category> foodAndCategories = foodAndCategoryService.getAllFoodAndCategories();

        List<Category> categories = categoryService.getAllCategories();

        Map<String,List<Food>> foodMap = new HashMap<>();

        for (Category category : categories){
            Long catId = category.getCategoryId();
            List<Food> foods = new ArrayList<>();
            for(Food_And_Category foodAndCategory : foodAndCategories){
                if(catId == foodAndCategory.getCategory().getCategoryId()){
                    foods.add(foodAndCategory.getFood());
                }
            }
            foodMap.put(category.getCategoryName(),foods);
        }

        List<CategoryAndFoodDTO> categoryAndFoodDTOS = new ArrayList<>();
        for(Map.Entry<String, List<Food>> entry : foodMap.entrySet()) {
            CategoryAndFoodDTO categoryAndFoodDTO = new CategoryAndFoodDTO(entry.getKey(), entry.getValue());
            categoryAndFoodDTOS.add(categoryAndFoodDTO);
        }


        StyleAndCategoryResponse styleAndCategoryResponse = new StyleAndCategoryResponse();
        styleAndCategoryResponse.setCategoryAndFoodDTOS(categoryAndFoodDTOS);
        styleAndCategoryResponse.setStyle(style);

        return ResponseEntity.ok(styleAndCategoryResponse);
    }


    @PostMapping
    public void addNewTheme(@ModelAttribute Style style){
        styleService.saveTheme(style);
    }
}
