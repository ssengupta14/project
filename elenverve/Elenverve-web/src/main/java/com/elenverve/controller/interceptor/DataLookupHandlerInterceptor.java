package com.elenverve.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.elenverve.common.IConstants;
import com.elenverve.controller.initializer.DataLookupLoader;


public class DataLookupHandlerInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    DataLookupLoader loader;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        request.setAttribute(IConstants.PRODUCTS, loader.getAllProducts());
        request.setAttribute(IConstants.CATEGORIES, loader.getCategories());
        request.setAttribute(IConstants.COLLECTIONS, loader.getCollections());
        request.setAttribute(IConstants.OFFERS, loader.getOffers());
        return super.preHandle(request, response, handler);
    }
}
