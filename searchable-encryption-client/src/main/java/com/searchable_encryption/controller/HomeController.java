package com.searchable_encryption.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by Alexandru on 12/1/2015.
 */
@Controller
public class HomeController {


    private Log log = LogFactory.getLog(this.getClass());

    @RequestMapping(value = {"","/","/home"})
    public String index(Principal principal){
        log.debug("Mapped to index");
        if(principal != null){
            return "index";
        }
        return "login";
    }

    @RequestMapping(value = {"/login"})
    public String defaultPage(){
        log.debug("Mapped to index");
        return "login";
    }

    @RequestMapping(value = {"/about"})
    public String aboutPage(){
        return "about";
    }

    @RequestMapping(value = {"/store"})
    public String storeTextPage(){
        return "storeText";
    }

    @RequestMapping(value = {"/search"})
    public String searchPage(){
        return "search";
    }

    @RequestMapping(value = {"/test"})
    public String testPage(){
        return "test";
    }
}
