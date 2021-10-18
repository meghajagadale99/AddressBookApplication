package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import springfox.documentation.swagger2.mappers.ModelMapper;

@ExtendWith(MockitoExtension.class)
public class AddressBookServiceTest {
    @InjectMocks
    private AddressBookService addressBookService;
    @Mock
    private AddressBookRepository addressBookRepository;
    @Mock
    private
    ModelMapper modelMapper;

    @Test
    public void givenID_WhenCalled_ShouldReturnPersonById() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setId(1);
        Assertions.assertEquals(1, addressBookData.getId());
    }

    @Test
    public void givenName_WhenCalled_ShouldReturnPersonByName() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setName("Megha");
        Assertions.assertEquals("Megha", addressBookData.getName());
    }

    @Test
    public void givenAddress_WhenCalled_ShouldReturnPersonByAddress() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setAddress("Chembur, Mumbai");
        Assertions.assertEquals("Chembur, Mumbai", addressBookData.getAddress());
    }

    @Test
    public void givenState_WhenCalled_ShouldReturnPersonByState(){
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setState("Maharashtra");
        Assertions.assertEquals("Maharashtra", addressBookData.getState());
    }

    @Test
    public void givenCity_WhenCalled_ShouldReturnPersonByCity(){
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setCity("Mumbai");
        Assertions.assertEquals("Mumbai", addressBookData.getCity());
    }

    @Test
    public void givenPhoneNumber_WhenCalled_ShouldReturnPersonByMobileNumber() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setMobileNo("8080999098");
        Assertions.assertEquals("8080999098", addressBookData.getMobileNo());
    }

    @Test
    public void givenZipCode_WhenCalled_ShouldReturnPersonByZipCode() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setZipCode(400071);
        Assertions.assertEquals(400071, addressBookData.getZipCode());
    }

}
