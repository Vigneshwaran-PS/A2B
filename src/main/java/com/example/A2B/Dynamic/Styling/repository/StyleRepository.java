package com.example.A2B.Dynamic.Styling.repository;

import com.example.A2B.Dynamic.Styling.entity.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends JpaRepository<Style,Long> {
    Style findByProvince(String province);
}
