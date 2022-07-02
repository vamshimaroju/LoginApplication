package com.avm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionReference {

	private String CustomerContext;
	private String TransactionIdentifier;
}
