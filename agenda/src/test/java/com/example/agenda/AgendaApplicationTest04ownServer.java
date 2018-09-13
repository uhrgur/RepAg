package com.example.agenda;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AgendaApplicationTest04ownServer {

	
    @Autowired
    private MockMvc mockMvc;

    
    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/list")).andDo(print()).andExpect(status().isOk())   // en el perform get mapeamos lo que esperamos recibir, si escribimos una cosa contraria nos dara error.I
                .andExpect(content().string(containsString("")));// si en el string metemos cualquier cosa , nos dara error tambien.//al usar mockito creamos como una copia de nuestra aplicacion
        //para poder trabajar con ella sin fastidiarla.
    }
}