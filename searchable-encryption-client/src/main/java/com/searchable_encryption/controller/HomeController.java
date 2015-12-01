package com.searchable_encryption.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alexandru on 12/1/2015.
 */
@Controller
public class HomeController {


    private Log log = LogFactory.getLog(this.getClass());

    @RequestMapping(value = {"","/","/home"})
    public String index(){
        log.debug("Mapped to index");
        return "home";
    }
}
