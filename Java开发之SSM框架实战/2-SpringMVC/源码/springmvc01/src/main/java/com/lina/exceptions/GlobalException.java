package com.lina.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.SizeLimitExceededException;

/**
 * 全局的异常处理类
 */
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = {TeamIDException.class})
    public ModelAndView exHandler1(Exception ex){
        ModelAndView mv=new ModelAndView();
            mv.setViewName("idError");
        mv.addObject("msg",ex.getMessage());
        return mv;
    }
    @ExceptionHandler(value = {TeamNameException.class})
    public ModelAndView exHandler2(Exception ex){
        ModelAndView mv=new ModelAndView();
            mv.setViewName("nameError");
        mv.addObject("msg",ex.getMessage());
        return mv;
    }
    @ExceptionHandler(value ={TeamException.class})
    public ModelAndView exHandler3(Exception ex){
        ModelAndView mv=new ModelAndView();
            mv.setViewName("error");
        mv.addObject("msg",ex.getMessage());
        return mv;
    }


    @ExceptionHandler(value={Exception.class})
    public ModelAndView exHandler5(Exception ex){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("error");
        mv.addObject("msg",ex.getMessage());
        return mv;
    }
}
