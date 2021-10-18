/******************************************************************************
 *  Purpose: Class is implemented for handling the service the controller
 *         @Service annotation defines this class is service class
 *
 *  @author Megha Jagadale
 *  @version 1.0
 *  @since 13-10-2021
 *
 ******************************************************************************/

package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService {
    @Autowired
    private AddressBookRepository addressBookRepository;

    @Autowired
    private ModelMapper modelMapper;


    /**
     *  method finds all address book from repository
     * @return List of address book
     */
    public List<AddressBookData> findAllAddressBookData() {
        return addressBookRepository.findAll();
    }
    /**
     * method finds address book by id
     * @param id identifier in repository
     * @return address book
     * @throws AddressBookException
     */
    public AddressBookData findAddressBookById(int id) throws AddressBookException {
        return addressBookRepository.findById(id).orElseThrow(() -> new AddressBookException("Cannot find Address book by id: " + id));
    }

    /**
     * method stores address book into repository
     * @param addressBookDTO data stored in repository
     * @return address book
     */
    public AddressBookData saveAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData();
        modelMapper.map(addressBookDTO, addressBookData);
        addressBookRepository.save(addressBookData);
        return addressBookData;
    }
    /**
     * method updates address book by id
     * @param id identifier in repository
     * @param addressBookDTO data stored in repository
     * @return address book
     * @throws AddressBookException
     */
    public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) throws AddressBookException{
        AddressBookData addressBookData = this.findAddressBookById(id);
        modelMapper.map(addressBookDTO, addressBookData);
        addressBookRepository.save(addressBookData);
        return addressBookData;
    }
    /**
     * method deletes address book by id
     * @param id identifier in repository
     * @return address book
     * @throws AddressBookException
     */
    public String deleteAddressBookData(int id) throws AddressBookException {
        AddressBookData addressBookData = this.findAddressBookById(id);
        addressBookRepository.delete(addressBookData);
        return "Successfully deleted address book by id: " + id;
    }

}
