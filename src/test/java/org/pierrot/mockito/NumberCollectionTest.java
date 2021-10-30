package org.pierrot.mockito;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberCollectionTest {
    private List<Integer> mockedList;

    private NumberCollection numberCollection;

    @Before
    public void setUp() {
        mockedList = mock(List.class);
        numberCollection = new NumberCollection(mockedList);
    }

    @Test
    public void getTotalUsingLoop() {
        // Given
        when(mockedList.size()).thenReturn(3);
        when(mockedList.get(0)).thenReturn(1);
        when(mockedList.get(1)).thenReturn(2);
        when(mockedList.get(2)).thenReturn(3);

        assertEquals(1+2+3,numberCollection.getTotalUsingLoop());

        verify(mockedList,times(4)).size();
        verify(mockedList,times(3)).get(anyInt());

    }
}