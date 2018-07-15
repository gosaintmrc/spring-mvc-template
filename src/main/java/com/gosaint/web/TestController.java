package com.gosaint.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 13:27 2018/7/15
 * @Modified By:
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/cmd")
    public String testMvc(){
        return "Hello World";
    }
}
