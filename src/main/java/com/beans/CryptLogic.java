package com.beans;

public class CryptLogic {

	public static String encrypt(String input)
	{
		return input.toUpperCase();
	}
	
	public static String decrypt(String input)
	{
		return input.toLowerCase();
	}
}
