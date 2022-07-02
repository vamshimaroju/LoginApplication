package com.avm.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccessLicenseAgreementRequest {
	
	private String DeveloperLicenseNumber;
	private Request Request;
	private AccessLicenseProfile AccessLicenseProfile;

}
