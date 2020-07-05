package com.example.User.Exceptions;

public class UserNotFoundException extends RuntimeException {

	@Override
	public String toString() {
		return "UserNotFoundException : User does not exists for the given user id";
	}

}
