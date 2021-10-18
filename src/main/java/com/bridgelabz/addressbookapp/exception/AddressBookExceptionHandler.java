/**
 * Address Book exception handler handles exception and give response to bad http requests
 */
package com.bridgelabz.addressbookapp.exception;

import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AddressBookExceptionHandler {
    @ExceptionHandler(value = AddressBookException.class)
    public ResponseEntity<ResponseDTO> addressBookExceptionHandler(AddressBookException e) {
        ResponseDTO responseDto = new ResponseDTO(e.getMessage(), null);
        return new ResponseEntity<ResponseDTO>(responseDto, HttpStatus.BAD_REQUEST);
    }
}