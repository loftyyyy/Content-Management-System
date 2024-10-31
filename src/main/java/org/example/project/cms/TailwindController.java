package org.example.project.cms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/")
public class TailwindController {

    @RequestMapping
    public String index(Model model) {
        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        model.addAttribute( "names", names);
        return "index";
    }
}
