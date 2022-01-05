package br.com.erudio.greetingservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@RefreshScope
@ConfigurationProperties("greeting-service")
@AllArgsConstructor
@NoArgsConstructor
public class GreetingConfiguration {

	@Getter @Setter
	private String greeting;
	@Getter @Setter
	private String defaultValue;
}
