package com.example.agenda;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AgendaApplicationTests {

	@Test
	public void contextLoads() {
    	assertThat(true).isTrue(); // con esto comprobamos que funciona el Junit.
	}

}
