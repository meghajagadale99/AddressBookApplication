/******************************************************************************
 *  Purpose: this interface is repository interface which can give service
 *  		 to use the implementation of JpaRepository this is the class
 *  		 which we are extending in this interface
 *
 *  @author  Megha Jagadale
 *  @version 1.0
 *  @since   13-10-2021
 *
 ******************************************************************************/
package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
}
