package com.kou.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author JIAJUN KOU
 */

public class MyLocaleResolver implements LocaleResolver {
    /**
     * 解析请求
     * @param httpServletRequest
     * @return
     */
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //获取请求的语言参数
        String language = httpServletRequest.getParameter("l");

        //System.out.println("......."+language);
        //如果没有就是用默认的
        Locale locale=Locale.getDefault();
        if(!StringUtils.isEmpty(language)){
            String[] split = language.split("_");
           locale= new Locale(split[0],split[1]);
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
