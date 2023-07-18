package de.neuefische.bojava232restcar;

import java.util.List;

public class CarService {
    private CarRepository carRepository = new CarRepository();

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public List<Car> getCars() {
        return carRepository.getCars();
    }

    public void deleteById(String id) {
        carRepository.deleteById(id);
    }

    public void updateById(String id, Car car) {
        carRepository.updateById(id, car);
    }
}
