package cn.hangruan.admin.exception;

import cn.hangruan.admin.bean.ResultMessage;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ResponseBody
    @ExceptionHandler(value = {BadCredentialsException.class, AuthenticationServiceException.class})
    public ResultMessage credentialsException(Exception exception) {
        return new ResultMessage(ResultMessage.SUCCESS, exception.getMessage(), "");
    }

    @ResponseBody
    @ExceptionHandler(value = {Exception.class})
    public ResultMessage exceptionHandler(Exception exception) {
        System.out.printf(exception.getMessage());
        return new ResultMessage(ResultMessage.SUCCESS, "系统错误", "");
    }

}
