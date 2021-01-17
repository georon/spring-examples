package com.bedezi.rest1;
//import java.util.List;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RestResource;;

/**
 * @author Rony George
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
	
}
