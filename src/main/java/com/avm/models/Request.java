package com.avm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

	private String RequestOptions;
	private TransactionReference TransactionReference;
}
