package com.lambdaschool.usermodel.handlers;

import com.lambdaschool.usermodel.exceptions.ResourceFoundException;
import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import com.lambdaschool.usermodel.models.ErrorDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @Autowired
    private HelpFunctions helper;

    public RestExceptionHandler() {
        super();
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe) {
        ErrorDetail errorDetail = new ErrorDetail();
        errorDetail.setTimestamp(new Date());
        errorDetail.setStatus(HttpStatus.NOT_FOUND.value());
        errorDetail.setTitle("Resource Not Found");
        errorDetail.setDetail(rnfe.getMessage());
        errorDetail.setDeveloperMessage(rnfe.getClass().getName());
        errorDetail.setErrors(helper.getConstraintViolation(rnfe));

        return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceFoundException rnfe) {
        ErrorDetail errorDetail = new ErrorDetail();
        errorDetail.setTimestamp(new Date());
        errorDetail.setStatus(HttpStatus.BAD_REQUEST.value());
        errorDetail.setTitle("Resource Not Found");
        errorDetail.setDetail(rnfe.getMessage());
        errorDetail.setDeveloperMessage(rnfe.getClass().getName());
        errorDetail.setErrors(helper.getConstraintViolation(rnfe));

        return new ResponseEntity<>(errorDetail, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {

        ErrorDetail errorDetail = new ErrorDetail();
        errorDetail.setTimestamp(new Date());
        errorDetail.setStatus(status.value());
        errorDetail.setTitle("REST Internal Exception");
        errorDetail.setDetail(ex.getMessage());
        errorDetail.setDeveloperMessage(ex.getClass().getName());
        errorDetail.setErrors(helper.getConstraintViolation(ex));

        return new ResponseEntity<>(errorDetail, null, status);
    }
}

