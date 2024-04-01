package com.example.A2B.Dynamic.Styling.repository;

import com.example.A2B.Dynamic.Styling.entity.Food;
import com.example.A2B.Dynamic.Styling.entity.Food_And_Category;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class Food_And_Category_RepositoryTest {

    @Autowired
    private Food_And_Category_Repository repository;


    @Test
    public void getAllFoodAndCategory(){
        List<Food_And_Category> list = repository.findAll();
        System.out.println("Category And Food : "+list);
    }


}