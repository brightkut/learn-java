package com.learn.springbootmockito.mockito;

import com.learn.springbootmockito.model.MyList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class MockitoVerifyTest {
    @Mock
    private MyList myList;

    // Test method was called
    @Test
    public void testInvoke() {
        myList.size();
        verify(myList).size();
    }

    // Test the number method was called
    @Test
    public void testInvokeTimes() {
        myList.size();
        verify(myList, times(1)).size();
    }

    // Test no interact method
    @Test
    public void testNoInteract() {
        verifyNoInteractions(myList);
    }

    @Test
    public void testOrderCalled() {
        myList.size();
        myList.add("a parameter");
        myList.clear();

        InOrder inOrder = Mockito.inOrder(myList);
        inOrder.verify(myList).size();
        inOrder.verify(myList).add("a parameter");
        inOrder.verify(myList).clear();
    }

    @Test
    public void testAtLeastAndAtMost() {
        myList.clear();
        myList.clear();
        myList.clear();

        verify(myList, atLeast(1)).clear();
        verify(myList, atMost(3)).clear();
    }
}
