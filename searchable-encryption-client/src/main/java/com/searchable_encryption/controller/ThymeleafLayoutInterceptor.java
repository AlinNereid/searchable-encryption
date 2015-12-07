package com.searchable_encryption.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Alexandru on 12/6/2015.
 */
public class ThymeleafLayoutInterceptor extends HandlerInterceptorAdapter {

    private static final String DEFAULT_LAYOUT = "layouts/default";
    private static final String DEFAULT_VIEW_ATTRIBUTE_NAME = "view";

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView == null || !modelAndView.hasView()) {
            return;
        }
        String originalViewName = modelAndView.getViewName();

        if (isRedirectOrForward(originalViewName)) {
            return;
        }

        modelAndView.setViewName(DEFAULT_LAYOUT);
        modelAndView.addObject(DEFAULT_VIEW_ATTRIBUTE_NAME, originalViewName);
    }

    private boolean isRedirectOrForward(String viewName) {
        return viewName.startsWith("redirect:") || viewName.startsWith("forward:");
    }

}
