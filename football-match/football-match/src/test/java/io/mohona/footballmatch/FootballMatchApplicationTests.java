package io.mohona.footballmatch;

import io.mohona.footballmatch.resources.FoootballMatchResource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class FootballMatchApplicationTests {
	@Autowired
	private FoootballMatchResource foootballMatchResource;

	@Test
	void contextLoads() throws Exception{
       assertThat(foootballMatchResource).isNotNull();

	}
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/getStanding/c/l/t",
				String.class).contains("Sapient"));
	}
}

}
