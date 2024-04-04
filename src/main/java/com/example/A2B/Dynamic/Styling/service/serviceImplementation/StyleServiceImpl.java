package com.example.A2B.Dynamic.Styling.service.serviceImplementation;

import com.example.A2B.Dynamic.Styling.entity.Style;
import com.example.A2B.Dynamic.Styling.repository.StyleRepository;
import com.example.A2B.Dynamic.Styling.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StyleServiceImpl implements StyleService {


    @Autowired
    private StyleRepository repository;
    public Style getStyleByProvince(String province) {
        return repository.findByProvince(province);
    }

    public void saveTheme(Style style) {
        repository.save(style);
    }

    public void updateTheme(Style style) {
        Style style1 = repository.findByProvince(style.getProvince());
        style1.setAddress(style.getAddress());
        style1.setState(style.getState());
        style1.setRestaurantName(style.getRestaurantName());
        style1.setUniversalBackgroundColor(style.getUniversalBackgroundColor());
        style1.setUniversalFont(style.getUniversalFont());
        style1.setUniversalTextColor(style.getUniversalTextColor());
        style1.setBannerBackgroundColor(style.getBannerBackgroundColor());
        style1.setBannerTextColor(style.getBannerTextColor());
        style1.setMenuListSelectedBackGroundColor(style.getMenuListSelectedBackGroundColor());
        style1.setMenuListSelectedTextColor(style.getMenuListSelectedTextColor());
        style1.setViewButtonBackGroundColor(style.getViewButtonBackGroundColor());
        style1.setViewButtonTextColor(style.getViewButtonTextColor());
        style1.setFooterTextColor(style.getFooterTextColor());
        style1.setFooterBackGroundColor(style.getFooterBackGroundColor());
        repository.save(style1);
    }
}
