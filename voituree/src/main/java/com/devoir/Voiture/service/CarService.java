package com.devoir.Voiture.service;

import com.devoir.Voiture.dao.Car;
import com.devoir.Voiture.dao.CarRepository;
import com.devoir.Voiture.dto.CarDto;
import graphql.schema.diffing.ana.SchemaDifference;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements ICarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public CarDto saveCar(CarDto carDto) {
        Car car = modelMapper.map(carDto, Car.class);
        carRepository.save(car);
        return carDto;
    }

    @Override
    public List<CarDto> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDto> carDtos = new ArrayList<>();
        for (Car car : cars) {
            CarDto carDto = modelMapper.map(car, CarDto.class);
            carDtos.add(carDto);
        }
        return carDtos;
    }
}
