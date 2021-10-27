package com.example.springbootvalidationexample.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CommPreferenceValidator.class)
@Documented
public @interface CommPreference {

    String message() default "Communication preference must be email or mobilePhone.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
