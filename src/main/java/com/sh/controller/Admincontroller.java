package com.sh.controller;

import com.sh.pojo.Admin;
import com.sh.service.AdminService;
import com.sh.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author GGBond
 * @version 1.0
 */
@Controller
@RequestMapping("/admin")
public class Admincontroller {

    @Autowired
    AdminService adminService;

    @RequestMapping("/login")
    public String log(String name, String pwd, HttpServletRequest request){
        Admin admin = adminService.login(name,pwd);
        if(admin != null) {
            request.setAttribute("admin",admin);
            return "main";
        }else{
            request.setAttribute("errmsg","登陆失败");
            return "login";
        }
    }

    @ResponseBody
    @RequestMapping("/reg")
    public void reg(HttpServletRequest request,Admin admin){
        //String myname = (String) request.getAttribute("name");
        //String mypwd = (String) request.getAttribute("pwd");
        //Admin admin = new Admin();
        //admin.setaName(myname);
        //admin.setaPass(mypwd);
            if(admin.getaName() == null || admin.getaPass() == null){
                request.setAttribute("msg","不能为空");
            }else {
                adminService.insert(admin);
            }

    }

}
