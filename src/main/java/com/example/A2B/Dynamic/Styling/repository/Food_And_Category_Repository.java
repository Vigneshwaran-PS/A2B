package com.example.A2B.Dynamic.Styling.repository;

import com.example.A2B.Dynamic.Styling.entity.Food_And_Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Food_And_Category_Repository extends JpaRepository<Food_And_Category,Long> {

}
