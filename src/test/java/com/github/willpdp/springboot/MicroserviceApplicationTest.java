package com.github.willpdp.springboot;

import com.github.willpdp.springboot.domain.GravyDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static com.github.willpdp.springboot.Urls.DOES_THIS_FOOD_NEED_GRAVY_RESOURCE;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MicroserviceApplicationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testGravyForMostThings() {
        final String url = "http://localhost:" + port + DOES_THIS_FOOD_NEED_GRAVY_RESOURCE + "?food={food}";
        final ResponseEntity<GravyDto> response = testRestTemplate.getForEntity(url, GravyDto.class, Map.of("food", "chips"));
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(new GravyDto("chips", Boolean.TRUE));
    }

    @Test
    public void testGravyForIceCream() {
        final String url = "http://localhost:" + port + DOES_THIS_FOOD_NEED_GRAVY_RESOURCE + "?food={food}";
        final ResponseEntity<GravyDto> response = testRestTemplate.getForEntity(url, GravyDto.class, Map.of("food", "icecream"));
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(new GravyDto("icecream", Boolean.FALSE));
    }
}
