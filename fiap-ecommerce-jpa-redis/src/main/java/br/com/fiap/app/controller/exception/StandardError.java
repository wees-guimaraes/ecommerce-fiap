package br.com.fiap.app.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class StandardError implements Serializable {

	private Integer status;
	private String msg;
	private Long timeStamp;

}
