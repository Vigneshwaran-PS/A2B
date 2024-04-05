package com.example.A2B.Dynamic.Styling.dao;

import com.example.A2B.Dynamic.Styling.entity.Style;

public interface StyleDAO {
    Style findByProvince(String province);

    void save(Style style);
}
