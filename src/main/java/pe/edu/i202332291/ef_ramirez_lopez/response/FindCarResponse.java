package pe.edu.i202332291.ef_ramirez_lopez.response;

import pe.edu.i202332291.ef_ramirez_lopez.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto user) {

}
