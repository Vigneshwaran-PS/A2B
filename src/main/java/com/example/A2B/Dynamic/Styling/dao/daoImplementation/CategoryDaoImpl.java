package com.example.A2B.Dynamic.Styling.dao.daoImplementation;

import com.example.A2B.Dynamic.Styling.dao.CategoryDAO;
import com.example.A2B.Dynamic.Styling.entity.Category;
import com.example.A2B.Dynamic.Styling.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoImpl implements CategoryDAO {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
