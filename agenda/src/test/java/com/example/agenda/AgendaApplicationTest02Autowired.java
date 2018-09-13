package com.example.agenda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.agenda.controller.AppController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AgendaApplicationTest02Autowired {
	
	/*
	 * The @Autowired annotation is interpreted by the Spring and 
	 * the controller is injected before the test methods are run. 
	 * We are using AssertJ (assertThat() etc.) to express the 
	 * test assertions.
	 */

    @Autowired
    private AppController controller;

    @Test
    public void contexLoads() throws Exception {
    	//assertThat("asdasd").asList();
        assertThat(controller).isNotNull();  //si ponemos is null, nos dara error , si ponemos not null, no nos lo dara ya que comprueba el controller.
        
        //Para asegurar que falla elimina la linea del controlador
        //    @Controller
    }
}