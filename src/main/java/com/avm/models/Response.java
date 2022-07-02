package com.avm.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {

	private ResponseStatus ResponseStatus;
	private TransactionReference TransactionReference;
}
