package com.avm.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseStatus {

	private String Code;
	private String Description;
}
