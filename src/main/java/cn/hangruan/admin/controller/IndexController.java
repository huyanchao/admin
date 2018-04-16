package cn.hangruan.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 人员 前端控制器
 * </p>
 *
 * @author hyc
 * @since 2018-01-19
 */
@Controller
public class IndexController {


    @GetMapping("test")
    @ResponseBody
    public String getUser(){
        return "测试";
    }
}