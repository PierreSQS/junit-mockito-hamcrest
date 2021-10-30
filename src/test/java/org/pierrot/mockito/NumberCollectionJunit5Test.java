package org.pierrot.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class NumberCollectionJunit5Test {
    private List<Integer> mockedList;

    private NumberCollection numberCollection;

    @BeforeEach
    void setUp() {
        mockedList = mock(List.class);
        numberCollection = new NumberCollection(mockedList);
    }

    @Test
    void getTotalUsingLoop() {

        assertEquals(6, numberCollection.getTotalUsingLoop());

        verify(mockedList,times(4)).size();
        verify(mockedList,times(3)).get(anyInt());
    }
}
