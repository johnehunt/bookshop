package com.jjh.bookshop.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.jjh.bookshop.domain")
@EnableJpaRepositories("com.jjh.bookshop.repository")
@EnableAutoConfiguration
public class BookRepoTestConfig {
}
