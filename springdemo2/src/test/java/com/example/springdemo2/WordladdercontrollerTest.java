package com.example.springdemo2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordladdercontrollerTest {

    @Autowired
    private Wordladdercontroller wordladdercontroller;
    private MockMvc mockMvc;
    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(wordladdercontroller).build();
    }


    @Test
    public void contextload() throws Exception{
        mockMvc.perform(
                MockMvcRequestBuilders.get("/wordladder")
                        .param("start","pig")
                        .param("end","cat")
        )
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("cat->cag->cig->pig->"));



    }
    @Test
    public void contextload2() throws Exception{
        mockMvc.perform(
                MockMvcRequestBuilders.get("/wordladder")
                        .param("start","apple")
                        .param("end","print")
        )
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("print->prink->brink->brine->brise->arise->anise->anile->anole->amole->ample->apple->"));



    }
}