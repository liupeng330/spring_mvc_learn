package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoaderListener;

import javax.validation.Valid;

@Controller
@RequestMapping("/User")
public class UserInfoController
{
    //matching http get for url: /User/userinfo?new
    @RequestMapping(value = {"/userinfo"}, params = "new", method = RequestMethod.GET)
    public String createUserInfo(ModelMap model)
    {
        model.addAttribute("myUserInfo", new UserInfo());
        return "/User/userinfo/edit";
    }

    @RequestMapping(value = {"/userinfo"}, method = RequestMethod.POST)
    public String getUserInfo(ModelMap model, @Valid UserInfo userInfo, BindingResult bindingResult)
    {
        //当表单提交的数据有问题时，重新跳回到edit界面
        if(bindingResult.hasErrors())
        {
            return "/User/userinfo/edit";
        }

        //这里应该调用业务逻辑层的userInfoService.saveUserInfo(userInfo),
        //将表单传人过来的userinfo对象入库
        model.addAttribute("myUserInfo", userInfo);
        return "/User/userinfo/show";
    }
}
