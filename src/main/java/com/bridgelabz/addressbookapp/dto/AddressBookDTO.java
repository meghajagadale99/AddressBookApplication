/**
 * AddressBookDTO is used to transfer data to objects in service methods
 */
package com.bridgelabz.addressbookapp.dto;

import lombok.Data;


@Data
public class AddressBookDTO {
    private String name;
    private String address;
    private String state;
    private String city;
    private String mobileNo;
    private int zipCode;
}
