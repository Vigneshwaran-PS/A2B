package com.example.A2B.Dynamic.Styling.service.serviceImplementation;


import com.example.A2B.Dynamic.Styling.dao.CategoryDAO;
import com.example.A2B.Dynamic.Styling.entity.Category;
import com.example.A2B.Dynamic.Styling.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    public List<Category> getAllCategories() {
        return categoryDAO.findAll();
    }
}
