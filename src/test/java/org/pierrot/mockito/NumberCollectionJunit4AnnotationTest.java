package org.pierrot.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class NumberCollectionJunit4AnnotationTest {
    @Mock
    private List<Integer> mockedList;

    @InjectMocks
    private NumberCollection numberCollection;

    @Before
    public void setUp() {
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
