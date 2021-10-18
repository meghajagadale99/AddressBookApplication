/**
 * AddressBookConfig sets up configuration of additional beans required in application
 */

package com.bridgelabz.addressbookapp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressBookConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}