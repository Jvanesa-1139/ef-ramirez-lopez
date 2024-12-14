package pe.edu.i202332291.ef_ramirez_lopez.response;

import pe.edu.i202332291.ef_ramirez_lopez.dto.CarDto;

public record FindCarsResponse(
        String code,
        String error,
        Iterable<CarDto> users) {
}
