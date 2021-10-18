/******************************************************************************
 *  Purpose: Class is implemented for creating the POJO class
 *  		@Data, @Entity will tell the spring framework that this is POJO class
 *
 *  @author  Megha Jagadale
 *  @version 1.0
 *  @since   13-10-2021
 *
 ******************************************************************************/
package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private String state;
    private String city;
    private String mobileNo;
    private int zipCode;


}

