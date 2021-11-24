package by.kishko.storeschain.Exseptions;

import org.springframework.validation.BindingResult;

public class EmployeeValidationException extends RuntimeException {
    private final BindingResult bindingResult;

    public EmployeeValidationException(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }
}
