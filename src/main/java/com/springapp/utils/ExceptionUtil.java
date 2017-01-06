package com.springapp.utils;

import com.springapp.exception.BaseException;
import com.springapp.exception.BusinessException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.validation.ValidationException;

/**
 * @author zhangjin
 * @since 17/1/6
 */

public class ExceptionUtil {

    public static ModelAndView printErrorInfo(Exception ex) {
        ModelAndView mav = new ModelAndView();

        if (ex instanceof ValidationException) {
            BaseException e = (BaseException) ex;
            mav.addObject("code", e.getCode());
            mav.addObject("message", e.getMessage());
        } else if (ex instanceof BusinessException) {
            BaseException e = (BaseException) ex;
            mav.addObject("code", e.getCode());
            mav.addObject("message", e.getMessage());
        } else if (ex instanceof BaseException) {
            BaseException e = (BaseException) ex;
            mav.addObject("code", e.getCode());
            mav.addObject("message", e.getMessage());
        } else {
            mav.addObject("code", "10000");
            mav.addObject("message", "网络异常");
        }
        mav.setView(new MappingJackson2JsonView());
        return mav;
    }

}

