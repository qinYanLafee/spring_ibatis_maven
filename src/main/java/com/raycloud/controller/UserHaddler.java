package com.raycloud.controller;
import com.raycloud.entity.User;
import com.raycloud.service.imp.UserServiceImp;
import org.omg.CORBA.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import sun.awt.SunHints;

import java.lang.Object;
import java.util.Map;
/**
 * Created by 001117020015 on 2017/2/27.
 */
@SessionAttributes(value ="user")
@Controller
@RequestMapping(value ="user")
public class UserHaddler {
    @Autowired
    UserServiceImp userServiceImp;
/*路径配置出问题*/
    @RequestMapping(value ="list", method=RequestMethod.GET )
    public String queryByname(Map<String,Object> map){
       User user =userServiceImp.queryById(3);
        map.put("user",user);
        return "list";
    }
}
