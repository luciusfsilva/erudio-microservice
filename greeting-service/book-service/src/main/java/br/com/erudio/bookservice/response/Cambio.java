package br.com.erudio.bookservice.response;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class Cambio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionFactor;
	
	private BigDecimal convertedValue;
	
	private String environment;

}
