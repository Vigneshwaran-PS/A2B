package com.example.A2B.Dynamic.Styling.service;

import com.example.A2B.Dynamic.Styling.entity.Style;
import com.example.A2B.Dynamic.Styling.repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StyleService {


    @Autowired
    private StyleRepository repository;
    public Style getStyleByProvince(String province) {
        return repository.findByProvince(province);
    }

    public void saveTheme(Style style) {
        repository.save(style);
    }
}
