package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import web.service.CarServiceImpl;

import java.util.Optional;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarServiceImpl carService = new CarServiceImpl();

        model.addAttribute("carList", carService.getListCars(count));
        return "cars";
    }
}