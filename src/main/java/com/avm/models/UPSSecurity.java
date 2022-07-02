package com.avm.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UPSSecurity {

	private UsernameToken UsernameToken;
	private String ServiceAccessToken;
	
}
