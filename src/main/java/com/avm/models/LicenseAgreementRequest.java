package com.avm.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class LicenseAgreementRequest {

	private UPSSecurity UPSSecurity;
	private AccessLicenseAgreementRequest AccessLicenseAgreementRequest;
	
}
