package com.example.A2B.Dynamic.Styling.service.serviceImplementation;


import com.example.A2B.Dynamic.Styling.entity.Food_And_Category;
import com.example.A2B.Dynamic.Styling.repository.Food_And_Category_Repository;
import com.example.A2B.Dynamic.Styling.service.FoodAndCategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Food_And_Category_ServiceImpl implements FoodAndCategoryService {

    @Autowired
    private Food_And_Category_Repository repository;
    public List<Food_And_Category> getAllFoodAndCategories() {
        return repository.findAll();
    }
}