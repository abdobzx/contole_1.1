package com.devoir.Voiture.service;

import com.devoir.Voiture.dto.CarDto;

import java.util.List;

public interface ICarService {

    public CarDto saveCar(CarDto carDto);

    public List<CarDto> getCarByModel(String model);


}
