package com.example.A2B.Dynamic.Styling.service;


import com.example.A2B.Dynamic.Styling.entity.Food_And_Category;
import com.example.A2B.Dynamic.Styling.repository.Food_And_Category_Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Food_And_Category_Service {

    @Autowired
    private Food_And_Category_Repository repository;
    public List<Food_And_Category> getAllFoodAndCategories() {
        return repository.findAll();
    }
}
