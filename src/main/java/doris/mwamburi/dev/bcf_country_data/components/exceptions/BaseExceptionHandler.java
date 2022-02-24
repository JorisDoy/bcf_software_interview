package doris.mwamburi.dev.bcf_country_data.components.exceptions;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.validation.UnexpectedTypeException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Component
@Order(-2)
@ControllerAdvice
public class BaseExceptionHandler implements ResponseErrorHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleErrors(WebRequest webRequest, Exception exception) {

        int responseCode = 400;
        int statusCode = responseCode;

        String message = exception.getMessage();
        String exClassName = exception.getClass().getSimpleName();

        switch (exClassName) {
            case "HttpRequestMethodNotSupportedException":
                responseCode = 405;
                statusCode = responseCode;
                break;
            case "HttpMediaTypeNotSupportedException":
                responseCode = 415;
                statusCode = responseCode;
                break;
            case "MethodArgumentNotValidException":
                responseCode = 400;
                MethodArgumentNotValidException e = (MethodArgumentNotValidException) exception;
                for (FieldError error : e.getBindingResult().getFieldErrors()) {
                    message = "Kindly check this parameter " + error.getField() + ", because " + " " + error.getDefaultMessage();
                }
                break;
            case "MethodArgumentTypeMismatchException":
                responseCode = 400;
                MethodArgumentTypeMismatchException me = (MethodArgumentTypeMismatchException) exception;
                message = "Kindly check this parameter " + me.getName() + " should be of type " + me.getRequiredType().getName();
                break;
            case "UnexpectedTypeException":
                UnexpectedTypeException exe = (UnexpectedTypeException) exception;
                message = exe.getMessage();
                break;
            case "NoHandlerFoundException":
                responseCode = 404;
                statusCode = responseCode;
                break;
            case "ResourceAccessException":
                responseCode = 500;
                statusCode = responseCode;
                message = "Service is unreachable. Please try later.";
                break;
            case "HttpMessageNotReadableException":
                responseCode = 400;
                statusCode = responseCode;
                message = "Required request body is missing";
                break;
            case "DataIntegrityViolationException":
                responseCode = 400;
                statusCode = responseCode;
                message = "Required request body can not be the same as the previous one";
                break;
            case "NullPointerException":
                responseCode = 500;
                statusCode = 200;
                message = "Service is unreachable. Please try later.";
                exception.printStackTrace();
                break;
            case "Unauthorized":
                responseCode = 400;
                statusCode = 200;
                InvocationTargetException targetException = new InvocationTargetException(exception);
                message = targetException.getCause().getMessage();
                break;
            default:
                responseCode = 400;
                statusCode = responseCode;
                break;
        }
        return new ResponseEntity<>(HttpStatus.resolve(statusCode));
    }

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        return false;
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {

    }
}
