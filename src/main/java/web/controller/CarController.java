package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String getCars(@RequestParam(name="count", defaultValue = "5", required = false) int count, ModelMap model) {
        model.addAttribute("cars", new CarService().getCarsByCountCar(count));
        return "cars";
    }
}
