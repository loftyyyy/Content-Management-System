package org.example.project.cms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




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

    @RequestMapping("/user")
    public String user(Model model){
        model.addAttribute( "activeMenuItem", "user" );
        return "user/list";
    }

    @RequestMapping("/team/{id}")
    public String getTeam(@PathVariable("id") String id, Model model){
        model.addAttribute("id", id);
        return "Test";

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
