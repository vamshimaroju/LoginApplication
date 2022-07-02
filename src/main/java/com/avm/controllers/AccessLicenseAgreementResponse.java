package com.avm.controllers;

import com.avm.models.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccessLicenseAgreementResponse {

	private Response Response;
	private String AccessLicenseText;
}
