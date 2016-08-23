package com.springhrms.validator;

import com.springhrms.model.Employee;
import java.util.Date;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class HireDateValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        Date age = employee.getHireDate();

    }
}
