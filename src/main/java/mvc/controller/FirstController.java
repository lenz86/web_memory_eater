package mvc.controller;

import mvc.service.MemoryEater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @Autowired
    private MemoryEater memoryEater;

    @RequestMapping("/")
    public String homePage() {
        return "first-view";
    }

    @RequestMapping("/memoryEating")
    public String setDetails() {
        memoryEater.eatMemory(100);
        return "memory-eating";
    }

}
