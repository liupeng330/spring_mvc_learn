package com.springapp.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController
{
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, ModelMap model)
    {
        model.addAttribute("MyLoginInfo", new LoginInfo());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showLoginInfo(HttpServletRequest request, ModelMap model, LoginInfo loginInfo)
    {
        model.addAttribute("LoginResult", loginInfo);
        return "loginResult";
    }
}
