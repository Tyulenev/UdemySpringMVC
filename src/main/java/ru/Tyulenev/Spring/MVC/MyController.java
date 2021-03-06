package ru.Tyulenev.Spring.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "forms1/first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetailsView(Model model) {
        model.addAttribute("employee", new Employee());
        return "forms1/ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetailsView() {
//        return "show-emp-details-view";
//    }
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetailsView(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr." + empName;
//        model.addAttribute("nameAttribute", empName);
////        model.addAttribute("description", "- QSystems programmer");
//        return "show-emp-details-view";
//    }

        @RequestMapping("/showDetails")
    public String showEmployeeDetailsView(@RequestParam("employeeName")
                                                          String empName,
                                          Model model) {
        empName = "Mr." + empName;
        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", "- QSystems programmer");
        return "forms1/show-emp-details-view";
    }
}
