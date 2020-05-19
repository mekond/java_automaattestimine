package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import  org.junit.Before;
import  org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GreeterTest {
    @Mock
    private Counter counter;

    @InjectMocks
    private Greeter greeter;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello("Madis"), containsString("Hello"));
    }

    @Test
            public void testHaha() {
        //Given
        when(counter.nameLenght("")).thenReturn(0);

        //When
        String result=greeter.sayHello("");

        //then
        assertEquals("Hello short ", result);
    }

   /* @Test
    public void greeterTest() {
        String expectedName = "Madis";
        assertEquals(expectedName, );


    }
*/
}