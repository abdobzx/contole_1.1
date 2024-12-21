package com.devoir.Voiture.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    String model;
    String color;
    Long matricul;
    Float price;


}
