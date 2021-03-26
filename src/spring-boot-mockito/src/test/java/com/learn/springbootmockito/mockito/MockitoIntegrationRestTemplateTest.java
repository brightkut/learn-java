package com.learn.springbootmockito.mockito;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learn.springbootmockito.model.Employee;
import com.learn.springbootmockito.service.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringTestConfig.class)
public class MockitoIntegrationRestTemplateTest {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RestTemplate restTemplate;

    private ObjectMapper mapper = new ObjectMapper();

    private MockRestServiceServer mockRestServiceServer;

    @Before
    public void init() {
        mockRestServiceServer = MockRestServiceServer.createServer(restTemplate);
    }

    @Test
    public void testRestTemplate() throws JsonProcessingException {
        Employee expectedEmployee = new Employee("12", "Bob");

        mockRestServiceServer
                .expect(requestTo(URI.create("http://localhost:8080/employee/12")))
                .andExpect(method(HttpMethod.GET))
                .andRespond(withStatus(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(mapper.writeValueAsString(expectedEmployee)));

        Employee actual = employeeService.getEmployee("12");

        mockRestServiceServer.verify();


        assertEquals(expectedEmployee.getId(), actual.getId());
        assertEquals(expectedEmployee.getName(), actual.getName());
    }
}
