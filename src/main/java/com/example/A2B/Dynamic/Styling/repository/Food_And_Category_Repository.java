package com.example.A2B.Dynamic.Styling.repository;

import com.example.A2B.Dynamic.Styling.entity.Food;
import com.example.A2B.Dynamic.Styling.entity.Food_And_Category;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Food_And_Category_Repository extends JpaRepository<Food_And_Category,Long> {

}
