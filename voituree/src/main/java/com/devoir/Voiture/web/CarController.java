package com.devoir.Voiture.web;

import com.devoir.Voiture.dto.CarDto;
import com.devoir.Voiture.service.ICarService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarController {

    ICarService carService;

    @MutationMapping
    public CarDto saveCar (@Argument CarDto carDto){return carService.saveCar(carDto);}

    @QueryMapping
    public List<CarDto> getCarByModel(@Argument String model){return carService.getCarByModel(model);}

}
