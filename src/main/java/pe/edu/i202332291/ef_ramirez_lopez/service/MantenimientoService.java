package pe.edu.i202332291.ef_ramirez_lopez.service;

import pe.edu.i202332291.ef_ramirez_lopez.dto.CarDetailDto;
import pe.edu.i202332291.ef_ramirez_lopez.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface MantenimientoService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarDetailDto carDetailDto) throws Exception;
}
