package com.shawn.controller;

import com.shawn.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
   @Autowired
   private GirlProperties girlProperties;
  /*  @RequestMapping(value = "/say",method = RequestMethod.GET)*/
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myid){//require 是否必传
        return "id:"+myid;
   /*     return girlProperties.getCupSize();*/

    }
}