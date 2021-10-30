package org.pierrot.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class NumberCollectionJunit5AnnotationTest {
    @Mock
    private List<Integer> mockedList;

    @InjectMocks
    private NumberCollection numberCollection;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getTotalUsingLoop() {
        // Given and When
        when(mockedList.size()).thenReturn(3);
        when(mockedList.get(0)).thenReturn(1);
        when(mockedList.get(1)).thenReturn(2);
        when(mockedList.get(2)).thenReturn(3);

        // Then
        assertEquals(6, numberCollection.getTotalUsingLoop());

        verify(mockedList,times(4)).size();
        verify(mockedList,times(3)).get(anyInt());
    }
}
