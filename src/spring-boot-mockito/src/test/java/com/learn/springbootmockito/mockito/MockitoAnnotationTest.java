package com.learn.springbootmockito.mockito;

import com.learn.springbootmockito.service.AccountService;
import com.learn.springbootmockito.service.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {
    @InjectMocks
    @Spy
    private AccountService accountService;

    @Mock
    private PaymentService paymentService;

    @Captor
    private ArgumentCaptor<Integer> captor;

    @Test
    public void testBuyPoor() {
        // This line not affect because it's mock
        paymentService.buy(20);

        when(paymentService.buy(2)).thenReturn(2);

        String actual = accountService.buy(2);

        assertEquals("poor", actual);
    }

    @Test
    public void testBuyRich() {
        when(paymentService.buy(20)).thenReturn(20);

        String actual = accountService.buy(20);

        assertEquals("rich", actual);
    }

    @Test
    public void testBuyPoorWithSpy() {
        //use @Spy for stub act
        doReturn("rich").when(accountService).buy(2);

        String actual = accountService.buy(2);

        assertEquals("rich", actual);
    }

    @Test
    public void testBuyRichWithCaptor() {
        when(paymentService.buy(20)).thenReturn(20);

        String actual = accountService.buy(20);

        assertEquals("rich", actual);

        verify(accountService).buy(captor.capture());

        assertEquals(20, captor.getValue().intValue());
    }

    @Test
    public void testArgumentMatcher() {
        when(paymentService.sell(anyInt(), anyString())).thenReturn("sell");

        String actual = accountService.sell(20, "hello");

        assertEquals("sell", actual);
    }
}
