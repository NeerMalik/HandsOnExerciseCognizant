package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;
public class MyServiceTest {

    @Test
    void testMockingAndStubbing() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();

    }
    @Test
    void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.save("Java");

        verify(mockApi).saveData(eq("Java"));

    }
    @Test
    void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).process();

        MyService service = new MyService(mockApi);

        service.executeProcess();

        verify(mockApi).process();
    }
    @Test
    void testMultipleReturns() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First")
                .thenReturn("Second")
                .thenReturn("Third");

        assertEquals("First", mockApi.getData());

        assertEquals("Second", mockApi.getData());

        assertEquals("Third", mockApi.getData());

    }


    @Test
    void testInteractionOrder() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.executeOrder();

        InOrder order = inOrder(mockApi);

        order.verify(mockApi).firstMethod();

        order.verify(mockApi).secondMethod();

    }
    @Test
    void testVoidMethodException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("Error"))
                .when(mockApi)
                .process();

        MyService service = new MyService(mockApi);

        try {

            service.executeProcess();

        } catch (RuntimeException e) {

            assertEquals("Error", e.getMessage());

        }

        verify(mockApi).process();
    }


}