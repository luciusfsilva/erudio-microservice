package br.com.erudio.bookservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import br.com.erudio.bookservice.model.Book;
import br.com.erudio.bookservice.proxy.CambioProxy;
import br.com.erudio.bookservice.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
//import br.com.erudio.bookservice.response.Cambio;

@Tag(name = "Book endpoint")
@RestController
@RequestMapping("book-service")
public class BookController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CambioProxy proxy;
	
	/*@GetMapping(value ="/{id}/{currency}")
	public Book findBook(@PathVariable("id") Long id,
						 @PathVariable("currency") String currency) {
		
		var book = repository.getById(id);
		if (book == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Book not Found");
		
		HashMap<String, String> params = new HashMap<>();
		params.put("amount", book.getPrice().toString());
		params.put("from", "USD");
		params.put("to", currency);
		
		var response = new RestTemplate().getForEntity("http://localhost:8000/cambio-service/{amount}/{from}/{to}", Cambio.class, params);
		var cambio = response.getBody();
		
		var port = environment.getProperty("local.server.port");
		book.setEnvironment(port);
		book.setPrice(cambio.getConvertedValue().doubleValue());
		return book;
	}*/
	
	@GetMapping(value ="/{id}/{currency}")
	@Operation(summary = "Find a specific book by your ID")
	public Book findBook(@PathVariable("id") Long id,
						 @PathVariable("currency") String currency) {
		
		var book = repository.getById(id);
		if (book == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Book not Found");
		
		var cambio = proxy.getCambio(new BigDecimal(book.getPrice()), "USD", currency);
		
		var port = environment.getProperty("local.server.port");
		book.setEnvironment("Book port: " + port + " Cambio Port " + cambio.getEnvironment());
		book.setPrice(cambio.getConvertedValue().doubleValue());
		return book;
	}

}
