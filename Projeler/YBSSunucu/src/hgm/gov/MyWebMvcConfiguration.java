package hgm.gov;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc

public class MyWebMvcConfiguration {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				List<String> urls = new ArrayList<>();
				urls.add("http://localhost:4200");

				List<String> exposedHeaders = new ArrayList<>();
				exposedHeaders.add("Access-Control-Allow-Headers");
				exposedHeaders.add("Origin");
				exposedHeaders.add("Accept, X-Requested-With");
				exposedHeaders.add("Content-Type");
				exposedHeaders.add("Access-Control-Request-Method");
				exposedHeaders.add("Access-Control-Request-Headers");

				registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS").allowCredentials(true).allowedOrigins(urls.toArray(new String[urls.size()])).exposedHeaders(exposedHeaders.toArray(new String[exposedHeaders.size()]));
			}
		};
	}

}