package com.bedezi.rest1;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("address")
public class Address {
	@Id
	@Generated
	Long id;
	
	String name;
	
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}




}

/**
CREATE TABLE `address` (
`id_address` int(11) NOT NULL,
`full_name` varchar(100) DEFAULT NULL,
`address_line1` varchar(100) NOT NULL,
`address_line2` varchar(100) DEFAULT NULL,
`addresscol` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id_address`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;
**/