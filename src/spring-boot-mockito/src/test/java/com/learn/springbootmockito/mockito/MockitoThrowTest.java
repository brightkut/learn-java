package com.learn.springbootmockito.mockito;

import com.learn.springbootmockito.model.MyDictionary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitoThrowTest {
    @Mock
    private MyDictionary myDictionary;

    @Test(expected = NullPointerException.class)
    public void testNonVoid() {
        when(myDictionary.getMeaning(anyString())).thenThrow(NullPointerException.class);

        myDictionary.getMeaning("word");
    }

    @Test(expected = NullPointerException.class)
    public void testVoid() {
        doThrow(NullPointerException.class).when(myDictionary).add(anyString(), anyString());
        myDictionary.add("word", "word");
    }

    @Test
    public void testVoidAnotherWay() {
        doNothing().when(myDictionary).add(anyString(), anyString());
        myDictionary.add("w", "ww");
    }

    @Test()
    public void testMultipleCalled() {
        when(myDictionary.getMeaning(anyString()))
                .thenThrow(NullPointerException.class)
                .thenThrow(RuntimeException.class);
        try {
            myDictionary.getMeaning("word");
        } catch (NullPointerException ex) {
            assertThat(ex, instanceOf(NullPointerException.class));
        }

        try {
            myDictionary.getMeaning("w");
        } catch (RuntimeException ex) {
            assertThat(ex, instanceOf(RuntimeException.class));
        }
    }
}
