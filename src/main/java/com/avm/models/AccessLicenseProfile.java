package com.avm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccessLicenseProfile {
	private String CountryCode;
	private String LanguageCode;
}
