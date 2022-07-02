package com.avm.controllers;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.avm.models.AccessLicenseAgreementRequest;
import com.avm.models.AccessLicenseProfile;
import com.avm.models.LicenseAgreementRequest;
import com.avm.models.Request;
import com.avm.models.TransactionReference;
import com.avm.models.UPSSecurity;
import com.avm.models.UsernameToken;
import com.avm.models.licenseResponse;
import com.google.gson.Gson;

public class Test {
	public static void main(String[] args) throws IOException {

//		LicenseAgreementRequest request = new LicenseAgreementRequest();
//		
//		UPSSecurity security = new UPSSecurity();
//		security.setUsernameToken(new UsernameToken("dleupsready", "Litlriv3r22!"));
//		security.setServiceAccessToken("0D71C5A569255075");
//		
//		request.setUPSSecurity(security);
//		
//		AccessLicenseAgreementRequest licenseRequest = new AccessLicenseAgreementRequest();
//		licenseRequest.setDeveloperLicenseNumber("1D9D66ED7B3B41B2");
//		licenseRequest.setAccessLicenseProfile(new AccessLicenseProfile("US","EN"));
//		request.setAccessLicenseAgreementRequest(licenseRequest);
//		
//		licenseRequest.setRequest(new Request("AllTools", new TransactionReference("new End User key", "")));
//		
//		System.out.println(new Gson().toJson(request));
		String request = "{\"UPSSecurity\":{\"UsernameToken\":{\"Username\":\"dleupsready\",\"Password\":\"Litlriv3r22!\"},\"ServiceAccessToken\":\"\"},\"AccessLicenseAgreementRequest\":{\"DeveloperLicenseNumber\":\"1D9D66ED7B3B41B2\",\"Request\":{\"RequestOptions\":\"AllTools\",\"TransactionReference\":{\"CustomerContext\":\"new End User key\",\"TransactionIdentifier\":\"\"}},\"AccessLicenseProfile\":{\"CountryCode\":\"US\",\"LanguageCode\":\"EN\"}}}";
		
		RestTemplate test = new RestTemplate();
		
		ResponseEntity<String> response = test.postForEntity("https://wwwcie.ups.com/rest/License", request, String.class);
		if(response.getStatusCode()==HttpStatus.OK) {
			String resp = response.getBody();
			System.out.println(new Gson().toJson(resp));
		}
//		System.out.println(k.getAccessLicense());
//	    Path fileName = Path.of(
//	            "/Users/vamshimaroju/Desktop/lic.txt");
//	 
//	        // Writing into the file
//	        Files.writeString(fileName, result);
//	        System.out.println("completed");
	 
	}
}
