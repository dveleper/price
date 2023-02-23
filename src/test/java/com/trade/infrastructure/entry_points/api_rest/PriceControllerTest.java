package com.trade.infrastructure.entry_points.api_rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trade.domain.model.Input;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@Log4j2
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private Input input;

    ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    void getPriceFirstTest() throws Exception {
        buildInputForFirstTest();
        String response = mockMvc.perform(get("/api/price").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(input)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price", is(35.50)))
                .andReturn()
                .getResponse()
                .getContentAsString();
        log.info("RESPONSE FIRST TEST ----> " + response);
    }

    @Test
    void getPriceSecondTest() throws Exception {
        buildInputForSecondTest();
        String response = mockMvc.perform(get("/api/price").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(input)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price", is(25.45)))
                .andReturn()
                .getResponse()
                .getContentAsString();
        log.info("RESPONSE SECOND TEST ----> " + response);
    }

    @Test
    void getPriceThirdTest() throws Exception {
        buildInputForThirdTest();
        String response = mockMvc.perform(get("/api/price").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(input)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price", is(35.50)))
                .andReturn()
                .getResponse()
                .getContentAsString();
        log.info("RESPONSE THIRD TEST ----> " + response);
    }

    @Test
    void getPriceFourthTest() throws Exception {
        buildInputForFourthTest();
        String response = mockMvc.perform(get("/api/price").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(input)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price", is(30.50)))
                .andReturn()
                .getResponse()
                .getContentAsString();
        log.info("RESPONSE FOURTH TEST ----> " + response);
    }

    @Test
    void getPriceFifthTest() throws Exception {
        buildInputForFifthTest();
        String response = mockMvc.perform(get("/api/price").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(input)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price", is(38.95)))
                .andReturn()
                .getResponse()
                .getContentAsString();
        log.info("RESPONSE FIFTH TEST ----> " + response);
    }

    void buildInputForFirstTest() {
        input = new Input();
        input.setDateIn("2020-06-14-10.00.00");
        input.setProductId(35455);
        input.setBrandId(1);
    }

    void buildInputForSecondTest() {
        input = new Input();
        input.setDateIn("2020-06-14-16.00.00");
        input.setProductId(35455);
        input.setBrandId(1);
    }

    void buildInputForThirdTest() {
        input = new Input();
        input.setDateIn("2020-06-14-21.00.00");
        input.setProductId(35455);
        input.setBrandId(1);
    }

    void buildInputForFourthTest() {
        input = new Input();
        input.setDateIn("2020-06-15-10.00.00");
        input.setProductId(35455);
        input.setBrandId(1);
    }

    void buildInputForFifthTest() {
        input = new Input();
        input.setDateIn("2020-06-15-21.00.00");
        input.setProductId(35455);
        input.setBrandId(1);
    }
}