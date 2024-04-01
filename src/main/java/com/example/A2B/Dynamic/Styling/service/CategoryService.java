package com.example.A2B.Dynamic.Styling.service;


import com.example.A2B.Dynamic.Styling.entity.Category;
import com.example.A2B.Dynamic.Styling.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> getAllCategories() {
        return repository.findAll();
    }
}
