package com.example.tienda200.bean;

import java.io.Serializable;

public class Calculadora implements Serializable{

	private Double operando1;
	private Double operando2;
	private String operacion;
	private Double resultado;
	
	
	
	public Calculadora(Double operando1, Double operando2, String operacion, Double resultado) {
		super();
		this.operando1 = operando1;
		this.operando2 = operando2;
		this.operacion = operacion;
		this.resultado = resultado;
	}
	
	public Double getOperando1() {
		return operando1;
	}
	public void setOperando1(Double operando1) {
		this.operando1 = operando1;
	}
	public Double getOperando2() {
		return operando2;
	}
	public void setOperando2(Double operando2) {
		this.operando2 = operando2;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public Double getResultado() {
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	} 
	
	public boolean procesar() {
		
		switch (operacion) {
		case "suma": resultado = operando1 + operando2;break;
		case "resta": resultado = operando1 - operando2;break;
		case "multiplicacion": resultado = operando1 * operando2; break;
		case "division": resultado = operando1 / operando2; break;
		default: 
			return (false);
		}
		return (true);
	}
	
	
}
