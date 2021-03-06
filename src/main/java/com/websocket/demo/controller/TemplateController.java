package com.websocket.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 模板测试
 * @author LXX
 */
@Controller
public class TemplateController {

    /**
     * 返回html模板
     * @param map
     * @return
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return "/helloHtml";
    }
}
