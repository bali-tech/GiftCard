package com.giftCardOrder.springboot.Exception;


	import java.util.HashMap;
	import java.util.Map;

	import org.springframework.http.HttpHeaders;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.validation.FieldError;
	import org.springframework.web.bind.MethodArgumentNotValidException;
	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;
	import org.springframework.web.context.request.WebRequest;
	import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


	@ControllerAdvice
	public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
		@ExceptionHandler(GiftCardNameNotFoundException.class)
		public ResponseEntity<ErrorDetails> resourceNotFound(GiftCardNameNotFoundException ex,WebRequest request){
			ErrorDetails response = new ErrorDetails();
			response.setErrorCode(611);
			response.setErrorMessage(ex.getMessage());
			
			return new ResponseEntity<ErrorDetails>(response,HttpStatus.NOT_FOUND);
		}
		
		
		@ExceptionHandler(MinimumAmountException.class)
		public ResponseEntity<ErrorDetails> resourceNotFound(MinimumAmountException ex,WebRequest request){
			ErrorDetails response = new ErrorDetails();
			response.setErrorCode(613);
			response.setErrorMessage(ex.getMessage());
			
			return new ResponseEntity<ErrorDetails>(response,HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler(MaximumAmountException.class)
		public ResponseEntity<ErrorDetails> resourceNotFound(MaximumAmountException ex,WebRequest request){
			ErrorDetails response = new ErrorDetails();
			response.setErrorCode(614);
			response.setErrorMessage(ex.getMessage());
			
			return new ResponseEntity<ErrorDetails>(response,HttpStatus.NOT_FOUND); 
		}
		
			
		@Override
		protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
				HttpHeaders headers, HttpStatus status, WebRequest request) {
			Map<String, String> errors = new HashMap<>();
			ex.getBindingResult().getAllErrors().forEach((error) -> {
				String fieldName = ((FieldError) error).getField();
				String message = error.getDefaultMessage();
				errors.put(fieldName, message);
			});
			return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
		}
		
	}
	


