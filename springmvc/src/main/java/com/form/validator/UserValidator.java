package com.form.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.form.User;

public class UserValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		User user = (User)target;
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "","Email is empty");
		if (!user.getEmail().contains("@")) {
			errors.rejectValue("email","", "Email is not valid.");
		}
		
	}

}


