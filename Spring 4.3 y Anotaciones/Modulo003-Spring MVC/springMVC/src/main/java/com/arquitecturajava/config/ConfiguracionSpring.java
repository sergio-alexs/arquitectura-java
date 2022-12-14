package com.arquitecturajava.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.arquitecturajava.*")
@EnableWebMvc
@Import({ConfiguracionPersistencia.class,ConfiguracionMVC.class,ConfiguracionSeguridad.class})
public class ConfiguracionSpring {

	
}
