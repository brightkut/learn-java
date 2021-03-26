package com.learn.springbootmockito.mockito;

import com.learn.springbootmockito.model.Employee;
import com.learn.springbootmockito.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockSimpleWayRestTemplateTest {
    @InjectMocks
    private EmployeeService employeeService;

    @Mock
    private RestTemplate restTemplate;

    @Test
    public void testRestTemplate() {
        Employee expectedEmployee = new Employee("12", "Bob");

        when(restTemplate.getForEntity(anyString(), any())).thenReturn(new ResponseEntity(expectedEmployee, HttpStatus.OK));

        Employee actual = employeeService.getEmployee("12");

        assertEquals(expectedEmployee, actual);
    }
}
