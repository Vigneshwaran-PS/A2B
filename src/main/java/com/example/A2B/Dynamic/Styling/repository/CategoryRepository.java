package com.example.A2B.Dynamic.Styling.repository;

import com.example.A2B.Dynamic.Styling.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
