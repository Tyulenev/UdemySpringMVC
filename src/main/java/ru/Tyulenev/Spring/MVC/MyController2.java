package ru.Tyulenev.Spring.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee2")
public class MyController2 {

    @RequestMapping("/")
    public String showFirstView() {
        return "forms2/first-view-2";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetailsView(Model model) {
        model.addAttribute("employee", new Employee());
        return "forms2/ask-emp-details-view-2";
    }

        @RequestMapping("/showDetails")
    public String showEmployeeDetailsView(@RequestParam("employeeName")
                                                          String empName,
                                          Model model) {
        empName = "Mr." + empName;
        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", "- QSystems programmer");
        return "forms2/show-emp-details-view-2";
    }
}
