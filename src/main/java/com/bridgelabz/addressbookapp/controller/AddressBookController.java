/******************************************************************************
 *  Purpose: Class is implemented for handling the request from the user
 *  		 @RestController defines that it will deal with the rest controller
 *
 *  @author  Megha Jagadale
 *  @version 1.0
 *  @since   13-10-2021
 *
 ******************************************************************************/

package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;


@RestController
@RequestMapping("/Api")
public class AddressBookController {
    @Autowired
    private AddressBookService addressBookService;

    /**
     * @purpose: Ability To Get All Person From Address book.
     * @Execution URL: localhost:8080/addressbook/get.
     * @return: response DTO.
     */

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBookList(){
        List<AddressBookData>addressBookDataList=addressBookService.findAllAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("Get All Person ", addressBookDataList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * @purpose: Ability to get person by id from address book.
     * @param: id.
     * @Execution URL: localhost:8080/addressbook/get/1.
     * @return:responseDTO.
     */

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable int id) {
        AddressBookData addressBookData=addressBookService.findAddressBookById(id);
        ResponseDTO responseDTO = new ResponseDTO("Get person by id successfully executed" +id, addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * @purpose: Ability to add person to the address book.
     * @param: addressbookDTO.
     * @Execution URL: localhost:8080/addressbook/create.
     * @return:responseDTO
     */

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=addressBookService.saveAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("add person Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * @purpose: Ability to update person to the address book.
     * @param: addressbookDTO.
     * @param: id.
     * @Execution URL: localhost:8080/addressbook/update/1.
     * @return: responseDTO.
     */

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData( @PathVariable int id, @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=addressBookService.updateAddressBookData( id, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated person Successfully" + id, addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /**
     * @purpose: Ability to delete person from the address book.
     * @param: id.
     * @Execution URL: localhost:8080/addressbook/delete/1.
     * @return: responseDTO.
     */

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int id) {
        String addressBookData= addressBookService.deleteAddressBookData(id);
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully: " + id, addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

}