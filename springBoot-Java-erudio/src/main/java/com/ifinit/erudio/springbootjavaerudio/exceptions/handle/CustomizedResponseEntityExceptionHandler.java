package com.ifinit.erudio.springbootjavaerudio.exceptions.handle;

import com.ifinit.erudio.springbootjavaerudio.exceptions.ExcetionResponse;
import com.ifinit.erudio.springbootjavaerudio.exceptions.UnsupportedOperatorMathException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

@ExceptionHandler(Exception.class)
public final ResponseEntity<ExcetionResponse> handleAllExceptions(Exception ex, WebRequest webRequest){

    ExcetionResponse response = new ExcetionResponse(new Date(), ex.getMessage(), webRequest.getDescription(false));
    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

}

    @ExceptionHandler(UnsupportedOperatorMathException.class)
    public final ResponseEntity<ExcetionResponse> handleBadRequestExceptions(Exception ex, WebRequest webRequest){

        ExcetionResponse response = new ExcetionResponse(new Date(), ex.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }




}
