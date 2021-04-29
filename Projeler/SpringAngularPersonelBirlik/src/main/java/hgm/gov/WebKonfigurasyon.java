package hgm.gov;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebKonfigurasyon {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {

				List<String> methods = new ArrayList<String>();
				methods.add("GET");
				methods.add("POST");
				methods.add("PUT");
				methods.add("PATCH");
				methods.add("DELETE");
				methods.add("OPTIONS");

				List<String> origins = new ArrayList<String>();
				origins.add("http://localhost:4200"); // kendi bilgisayarınızda angular projesinden test yapmak için izin beriliyor
				origins.add("http://localhost:8100"); // kendi pc den ionic üzerinden test yapmak için
				origins.add("capacitor://localhost"); // mobilden çağrılmak için yetki veriliyor
				origins.add("http://192.168.249.130:8100");
				origins.add("http://192.168.48.130:8100");
				origins.add("http://192.168.111.130:8100");
				origins.add("http://192.168.7.130:8100");

				List<String> exposedHeaders = new ArrayList<String>();
				exposedHeaders.add("Access-Control-Allow-Headers");
				exposedHeaders.add("Origin");
				exposedHeaders.add("Accept, X-Requested-With");
				exposedHeaders.add("Content-Type");
				exposedHeaders.add("Access-Control-Request-Method");
				exposedHeaders.add("Access-Control-Request-Headers");

				// @formatter:off
				registry.addMapping("/**").allowedMethods(methods.toArray(new String[methods.size()])).allowCredentials(true).allowedOrigins(origins.toArray(new String[origins.size()])).exposedHeaders(exposedHeaders.toArray(new String[exposedHeaders.size()]));
				// @formatter:on
			}
		};
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
