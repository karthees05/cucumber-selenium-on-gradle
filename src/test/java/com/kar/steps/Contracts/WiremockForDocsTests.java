//package com.kar.steps.Contracts;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
//import org.springframework.stereotype.Service;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static com.github.tomakehurst.wiremock.client.WireMock.*;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureWireMock(port = 9999)
//public class WiremockForDocsTests {
//
//    // A service that calls out over HTTP
//    @Autowired
//    private Service service;
//
//    @Before
//    public void setup() {
//        this.service.setBase("http://localhost:"
//                + this.environment.getProperty("wiremock.server.port"));
//    }
//
//    // Using the WireMock APIs in the normal way:
//    @Test
//    public void contextLoads() throws Exception {
//        // Stubbing WireMock
//        stubFor(get(urlEqualTo("/resource")).willReturn(aResponse()
//                .withHeader("Content-Type", "text/plain").withBody("Hello World!")));
//        // We're asserting if WireMock responded properly
//        assertThat(this.service.go()).isEqualTo("Hello World!");
//    }
//
//}