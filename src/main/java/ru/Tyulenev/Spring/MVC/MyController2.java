package ru.Tyulenev.Spring.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        Employee emp = new Employee();
        emp.setName("Ivan");
        emp.setSurname("Petrov");
        emp.setSalary(500);
        model.addAttribute("employee", emp);
        return "forms2/ask-emp-details-view-2";
    }

        @RequestMapping("/showDetails")
    public String showEmployeeDetailsView(@ModelAttribute("employee") Employee emp) {
        emp.setName("Mr. " + emp.getName());
        return "forms2/show-emp-details-view-2";
    }
}
