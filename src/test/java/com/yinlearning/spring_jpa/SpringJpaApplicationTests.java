package com.yinlearning.spring_jpa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringJpaApplicationTests {

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
	}

	@Test
	void booksEndpointReturnsBooks() {
		String response = RestClient.create("http://localhost:" + port)
				.get()
				.uri("/books")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.body(String.class);

		assertNotNull(response);
		assertTrue(response.contains("Domain Driven Design") || response.contains("J2EE Development without EJB"));
		assertTrue(response.contains("authors"));
	}

}
