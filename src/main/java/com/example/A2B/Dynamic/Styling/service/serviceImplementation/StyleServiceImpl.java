package com.example.A2B.Dynamic.Styling.service.serviceImplementation;

import com.example.A2B.Dynamic.Styling.dao.StyleDAO;
import com.example.A2B.Dynamic.Styling.entity.Style;
import com.example.A2B.Dynamic.Styling.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StyleServiceImpl implements StyleService {


    @Autowired
    private StyleDAO styleDAO;


    public Style getStyleByProvince(String province) {
        return styleDAO.findByProvince(province);
    }

    public void saveTheme(Style style) {
        styleDAO.save(style);
    }

    public void updateTheme(Style style) {
        Style style1 = styleDAO.findByProvince(style.getProvince());
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
        styleDAO.save(style1);
    }
}
