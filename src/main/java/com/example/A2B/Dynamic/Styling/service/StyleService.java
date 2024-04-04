package com.example.A2B.Dynamic.Styling.service;

import com.example.A2B.Dynamic.Styling.entity.Style;

public interface StyleService {
    Style getStyleByProvince(String province);

    void saveTheme(Style style);

    void updateTheme(Style style);
}
