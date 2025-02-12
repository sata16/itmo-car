package com.example.itmo_car.controllers;

import com.example.itmo_car.model.dto.request.CarInfoRequest;
import com.example.itmo_car.model.dto.response.CarInfoResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
   //создание
    @PostMapping
    public CarInfoResponse createCar(@RequestBody CarInfoRequest request) {
        return new CarInfoResponse();
    }
    //получение
    @GetMapping("/{id}")
    public CarInfoResponse getCar(@PathVariable Long id){
        return new CarInfoResponse();
    }
    //обновить информацию
    @PutMapping("/{id}")
    public CarInfoResponse updateCar(@PathVariable Long id, @RequestBody CarInfoRequest request) {
        return new CarInfoResponse();
    }
    //удаление
    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id){

    }
    //получение всех cars
    @GetMapping("/all")
    public List<CarInfoResponse> getAllCars(){
        return Collections.singletonList(new CarInfoResponse());
    }
}
