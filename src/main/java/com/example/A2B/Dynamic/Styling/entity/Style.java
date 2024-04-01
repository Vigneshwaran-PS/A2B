package com.example.A2B.Dynamic.Styling.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Style {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String province;
    private String address;
    private String state;
    private String restaurantName;
    private String universalFont;
    private String universalBackgroundColor;
    private String universalTextColor;
    private String bannerTextColor;
    private String bannerBackgroundColor;
    private String menuListSelectedBackGroundColor;
    private String menuListSelectedTextColor;
    private String viewButtonBackGroundColor;
    private String viewButtonTextColor;
    private String footerBackGroundColor;
    private String footerTextColor;
}
