package com.bridgelabz.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * To implement Address Book App development
 * @author - Megha Jagadale
 * @version - 0.0.1
 * @since - 13-10-2021
 */
@Component
@SpringBootApplication
public class AddressBookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookAppApplication.class, args);
		System.out.println("Welcome To Address Book App");
	}

}
