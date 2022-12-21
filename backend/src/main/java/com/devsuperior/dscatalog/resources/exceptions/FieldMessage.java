package com.devsuperior.dscatalog.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fieldNmame;
	private String message;
	
	public FieldMessage() {
	}

	public FieldMessage(String fieldNmame, String message) {
		this.fieldNmame = fieldNmame;
		this.message = message;
	}

	public String getFieldNmame() {
		return fieldNmame;
	}

	public void setFieldNmame(String fieldNmame) {
		this.fieldNmame = fieldNmame;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
