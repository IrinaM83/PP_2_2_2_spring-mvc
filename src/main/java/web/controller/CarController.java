package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl cs;

    public CarController(CarServiceImpl cs) {
        this.cs = cs;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(required = false) Integer count, Model model) {
        if (count == null) {
            count = 0;
        }
        model.addAttribute("cars", cs.printCars(count));
        return "cars";
    }
}
