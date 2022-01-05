package br.com.erudio.apigateway.configuration;

//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//@Configuration
public class ApiGatewayConfiguration {

	/*
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		//Vai interceptar tudo que estiver com o verbo get e passar trocar pelo endereço abaixo, como recomendado na documentação
		//do spring
		return builder.routes()
				.route(p -> p.path("/get")
				.filters(f -> f.addRequestHeader("hello", "word")
							  .addRequestParameter("Hello", "word"))
				.uri("http://httpbin.org:80"))
				
				.route(p -> p.path("/cambio-service/**")
						.uri("lb://cambio-service"))
				
				.route(p -> p.path("/book-service/**")
						.uri("lb://book-service"))
				.build();
	}*/
}
