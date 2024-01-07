package org.andy.springboot.project.common.advice;

import lombok.extern.slf4j.Slf4j;
import org.andy.springboot.project.common.response.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import javax.xml.bind.ValidationException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * exception handler for bad request.
     *
     * @param e exception
     * @return ResponseResult
     */
    @ResponseBody
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {BindException.class, ValidationException.class, MethodArgumentNotValidException.class})
    public ResponseResult<ExceptionData> handleParameterVerificationException(@NonNull Exception e) {
        ExceptionData.ExceptionDataBuilder exceptionDataBuilder = ExceptionData.builder();
        log.warn("handleParameterVerificationException: {}", e.getMessage());
        if (e instanceof BindException) {
            BindingResult bindingResult = ((MethodArgumentNotValidException) e).getBindingResult();
            bindingResult.getAllErrors().stream().map(error -> ((FieldError) error).getField() + ": " + error.getDefaultMessage())
                    .forEach(exceptionDataBuilder::error);
        } else if (e instanceof ConstraintViolationException) {
            if (e.getMessage() != null) {
                exceptionDataBuilder.error(e.getMessage());
            }
        } else {
            exceptionDataBuilder.error("invalid parameter");
        }
        return ResponseResult.fail(exceptionDataBuilder.build(), "invalid parameter");
    }

/*    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public ResponseResult<BusinessException> processBusinessException(BusinessException businessException) {
        log.error(businessException.getLocalizedMessage(), businessException);
        // 这里可以屏蔽掉后台的异常栈信息，直接返回"business error"
        return ResponseResultEntity.fail(businessException, businessException.getLocalizedMessage());
    }*/

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseResult<Exception> processException(Exception exception) {
        log.error(exception.getLocalizedMessage(), exception);
        // 这里可以屏蔽掉后台的异常栈信息，直接返回"server error"
        return ResponseResult.fail(exception, exception.getLocalizedMessage());
    }

}