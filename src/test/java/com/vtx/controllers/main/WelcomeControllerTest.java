package com.vtx.controllers.main;

import com.vtx.configs.ControllerConfiguration;
import com.vtx.configs.DomainConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DomainConfiguration.class, ControllerConfiguration.class})
@WebAppConfiguration
public class WelcomeControllerTest {

    private MockMvc mvc;

    @Autowired
    WebApplicationContext context;

    @Before
    public void Setup() {
        mvc = webAppContextSetup(this.context).build();
    }

    @Test
    public void testHello() throws Exception {
        this.mvc.perform(get("hello").param("name", "seo"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void testRead() throws Exception {
        this.mvc.perform(get("read").param("name", "seo"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}