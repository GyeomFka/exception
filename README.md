### 익셉션 핸들링

```java
@RestController
public class SampleController {

	@GetMapping("/exception")
	public void error() {
		throw new RuntimeException(" ::: call exception in controller :: ");
	}
}		
```

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = RuntimeException.class)
	public String runtimeException() {
		return " ::: error in handler ::: ";
	}
}
```
