package com.searchable_encryption.controller;

import com.searchable_encryption.business.DocumentBusiness;
import com.searchable_encryption.consumer.ServiceConsumer;
import com.searchable_encryption.model.Document;
import com.searchable_encryption.model.DocumentDto;
import com.searchable_encryption.model.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alexandru on 12/8/2015.
 */
@RestController
public class DocumentController {

    @Autowired
    private DocumentBusiness documentBusiness;

    @RequestMapping(value = "/store", method = RequestMethod.GET)
    public ModelAndView storeObjInit(Model model){
        ModelAndView mv = new ModelAndView("storeText");
        mv.addObject("documentdto", new DocumentDto());
        return mv;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView searchForObjInit(Model model){
        ModelAndView mv = new ModelAndView("search");
        mv.addObject("documentdto", new DocumentDto());
        return mv;
    }

    @RequestMapping(value = "/doc/new", method = RequestMethod.POST)
    public ModelAndView postTestObject(@ModelAttribute(value = "documentdto") DocumentDto documentdto,BindingResult bindingResult, Model model) throws NoSuchPaddingException, InvalidAlgorithmParameterException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ModelAndView mv = new ModelAndView("test");
        RedirectAttributes redirectAttributes = new RedirectAttributesModelMap();
        redirectAttributes.addAttribute("confirmation","Stored with success");
        if (bindingResult.hasErrors()) {
            mv.setViewName("error");
            return mv;
        }
        mv.addAllObjects(redirectAttributes.asMap());
        this.documentBusiness.saveDocument(documentdto.getText(),documentdto.getEncryptionType());
        System.out.println(documentdto);
        return mv;
    }

    @RequestMapping(value = "/doc/search", method = RequestMethod.POST)
    public ModelAndView searchObject(@ModelAttribute(value = "documentdto") DocumentDto documentdto,BindingResult bindingResult, Model model) throws Exception {
        ModelAndView mv = new ModelAndView("search");
        RedirectAttributes redirectAttributes = new RedirectAttributesModelMap();
        if (bindingResult.hasErrors()) {
            mv.setViewName("error");
            return mv;
        }
        List<List<String>> result = this.documentBusiness.searchDocuments(Arrays.asList(documentdto.getText().split(" ")), documentdto.getEncryptionType());

        redirectAttributes.addAttribute("result",result);

        redirectAttributes.addAttribute("confirmation", "Stored with success");

        mv.addAllObjects(redirectAttributes.asMap());

        System.out.println(result);
        return mv;
    }

    private List<ResultDto> getList(List<List<String>> result){
        List<ResultDto> resultDtos = new ArrayList<>();
        for(List<String> item : result){
            resultDtos.add(new ResultDto(item));
        }
        return resultDtos;
    }


}
