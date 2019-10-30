package org.generation.brainless;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@ComponentScan("org.generation.brainless")
@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}