package com.example.lab08.Controller;

import com.example.lab08.Models.Employee;
import com.example.lab08.Models.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @GetMapping("/")
    public String gettingEmployee(Model model){
        List<Employee> employeeList = service.listAll();
        model.addAttribute("employeeList", employeeList);
        return "employees/index";
    }
    @GetMapping("/add")
    public String gettingAdd(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employees/adding";
    }
    @PostMapping("/add")
    public String postingAdd(@ModelAttribute("employee") Employee employee){
        service.save(employee);
        return "redirect:/employees/";
    }
    @GetMapping("/edit/{id}")
    public ModelAndView gettingEdit(@PathVariable(name= "id") int id){
        ModelAndView mav = new ModelAndView("employees/editting");
        Employee employee = service.get(id);
        mav.addObject("employee", employee);
        return mav;
    }
    @PostMapping("/edit/{id}")
    public String postingEdit(@ModelAttribute("employee") Employee employee){
        service.save(employee);
        return "redirect:/employees/";
    }
    @GetMapping("/delete/{id}")
    public ModelAndView getDelete(@PathVariable(name = "id") int id, Model model){
        ModelAndView mav = new ModelAndView("employees/deleting");
        Employee employee = service.get(id);
        mav.addObject("employee", employee);
        model.addAttribute(id);
        return mav;
    }
    @PostMapping("/delete/{id}")
    public String postingDelete(@PathVariable(name = "id") int id){
        service.delete(id);
        return "redirect:/employees/";
    }
}
