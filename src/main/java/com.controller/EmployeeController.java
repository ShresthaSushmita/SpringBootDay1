package com.controller;

import com.dto.EmployeeDTO;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/login","/"})
    public String callLoginpage(){
        return "login";
    }

    @GetMapping("/register")
    public String registrationPage(){
        return "register";
    }
    @PostMapping("/loginValidate")
    public String authenticate(@RequestParam String emailId,@RequestParam String password, Model model) {
        EmployeeDTO	employeeDTO = employeeService.authenticate(emailId,password);

        if(employeeDTO!=null) {
            //correct userId+password
            model.addAttribute("employeeDTO", employeeDTO);
            return "congratulation";
        } else {
            //wrong credential
            model.addAttribute("message", "Wrong credential--Re-Try please!!!");
            return "login";
        }
    }
    @PostMapping("/registerValidate")
    public String registerEmployee(@ModelAttribute EmployeeDTO employeeDTO, Model model){
        employeeService.registerEmployee(employeeDTO);
        model.addAttribute("message", "Record inserted successfully");
        return "registrationStatus";
    }

    //Fetch all employees
    @GetMapping("/showEmployee")
    public String showAllEmployees(Model model){
        List<EmployeeDTO> employeeDTOList = employeeService.findAllEmployees();
        model.addAttribute("employeeDTOList", employeeDTOList);
        return "showAll";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam int employeeId, Model model){
        employeeService.deleteEmployee(employeeId);
        model.addAttribute("msg", "Record delete successfully");
        //return "deleteEmployee";
        return "redirect:/showEmployee";
    }
}
