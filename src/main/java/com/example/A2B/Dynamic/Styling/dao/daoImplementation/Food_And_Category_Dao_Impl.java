package com.example.A2B.Dynamic.Styling.dao.daoImplementation;

import com.example.A2B.Dynamic.Styling.dao.Food_And_Category_DAO;
import com.example.A2B.Dynamic.Styling.entity.Food_And_Category;
import com.example.A2B.Dynamic.Styling.repository.Food_And_Category_Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class Food_And_Category_Dao_Impl implements Food_And_Category_DAO {

    @Autowired
    private Food_And_Category_Repository foodAndCategoryRepository;

    @Override
    public List<Food_And_Category> findAll() {
        return foodAndCategoryRepository.findAll();
    }
}
