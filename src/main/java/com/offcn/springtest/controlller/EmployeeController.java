package com.offcn.springtest.controlller;


import com.offcn.springtest.bean.Employee;
import com.offcn.springtest.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmployeeController {
    @RequestMapping(value = {"/","/index.html"})
    public String jump(){
        System.out.println("跳转页面");
        return "login";
    }

    @Resource
    private EmployeeService employeeService;
    //用户登录
    @PostMapping("login")
    public String login(Integer eid, String ename, Model model){
        Employee employee=employeeService.login(eid,ename);
        if(employee!=null){
            return "showInfo";
        }else{
            model.addAttribute("msg","登录失败");
            return "login";
        }
    }

    //显示数据
    @GetMapping("showInfo")
    public String showInfo(){
        List<Employee> employeeList=employeeService.showInfo();
        return "emp/show";
    }
}
