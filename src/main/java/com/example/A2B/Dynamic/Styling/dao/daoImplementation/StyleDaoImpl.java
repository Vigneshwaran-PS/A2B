package com.example.A2B.Dynamic.Styling.dao.daoImplementation;


import com.example.A2B.Dynamic.Styling.dao.StyleDAO;
import com.example.A2B.Dynamic.Styling.entity.Style;
import com.example.A2B.Dynamic.Styling.repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StyleDaoImpl implements StyleDAO {

    @Autowired
    private StyleRepository styleRepository;

    @Override
    public Style findByProvince(String province) {
        return styleRepository.findByProvince(province);
    }

    @Override
    public void save(Style style) {
        styleRepository.save(style);
    }
}
