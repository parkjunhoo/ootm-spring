package kr.team3.ootm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddPlaceController {
    
    @RequestMapping("/addplace")
    public String addPlacePage() {
        return "payment/addplace";
    }
}
