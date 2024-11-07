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
        model.addAttribute( "activeMenuItem", "dashboard" );
        return "index";
    }

    @RequestMapping("/team")
    public String team(Model model){
        model.addAttribute( "activeMenuItem", "team" );
        return "index";
    }

    @RequestMapping("/project")
    public String project(Model model){
        model.addAttribute( "activeMenuItem", "project" );
        return "index";
    }

    @RequestMapping("/calendar")
    public String calendar(Model model){
        model.addAttribute( "activeMenuItem", "calendar" );
        return "index";
    }

    @RequestMapping("/document")
    public String document(Model model){
        model.addAttribute( "activeMenuItem", "document" );
        return "index";
    }

    @RequestMapping("/report")
    public String report(Model model){
        model.addAttribute( "activeMenuItem", "report" );
        return "index";
    }
}
