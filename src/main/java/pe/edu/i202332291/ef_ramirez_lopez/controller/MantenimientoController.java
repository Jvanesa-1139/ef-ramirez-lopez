package pe.edu.i202332291.ef_ramirez_lopez.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.i202332291.ef_ramirez_lopez.dto.CarDto;
import pe.edu.i202332291.ef_ramirez_lopez.service.MantenimientoService;

import java.util.List;

@Controller
@RequestMapping("/mantenimiento")
public class MantenimientoController {

    @Autowired
    MantenimientoService mantenimientoService;

    @GetMapping("/start")
    public String start(Model model) {

        try {
            List<CarDto> cars = mantenimientoService.getAllCars();
            model.addAttribute("cars", cars);
            model.addAttribute("error", null);

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "Ocurrió un error al obtener los datos");

        }
        return "mantenimiento";

    }

}
