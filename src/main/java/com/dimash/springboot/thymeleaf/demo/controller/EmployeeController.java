package com.dimash.springboot.thymeleaf.demo.controller;

import com.dimash.springboot.thymeleaf.demo.service.EmployeeService;
import com.dimash.springboot.thymeleaf.demo.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel){
        List<Employee> employeeList = employeeService.findAll();

        theModel.addAttribute("employees", employeeList);

        return "employees/list-employees";

    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        Employee theEmployee = new Employee();

        model.addAttribute("employee", theEmployee);

        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);

        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeid") int id, Model model){
        Employee employee = employeeService.findById(id);

        model.addAttribute("employee", employee);

        return "employees/employee-form";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeid") int id, Model model){
        employeeService.deleteById(id);

        return "redirect:/employees/list";
    }


}
