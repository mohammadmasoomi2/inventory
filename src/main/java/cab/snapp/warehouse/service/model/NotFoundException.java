package cab.snapp.warehouse.service.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends BusinessException {

  public NotFoundException(String message, HttpStatus status, Integer code) {
    super(message, status, code);
  }
}
