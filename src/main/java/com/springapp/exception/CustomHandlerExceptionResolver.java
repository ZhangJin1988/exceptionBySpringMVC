package com.springapp.exception;

import com.springapp.utils.ExceptionUtil;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangjin
 * @since 17/1/6
 */


public class CustomHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//        Map<String, Object> model = new HashMap<String, Object>();
//        model.put("e", e);
        //这里可根据不同异常引起类做不同处理方式，本例做不同返回页面。
//        String viewName = ClassUtils.getShortName(e.getClass());
        return ExceptionUtil.printErrorInfo(e);
    }
}
