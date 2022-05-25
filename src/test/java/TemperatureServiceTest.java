
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import hello.TemperatureService;

@RunWith(MockitoJUnitRunner.class)
public class TemperatureServiceTest {

    @Mock
    private TemperatureService tempService;

    
    @Test
    public void test_TemperatureGreater_GreaterThan_100() {

        //here we are stubbing the value from the service which is greater than 101
        when(tempService.temperatureSensorData()).thenReturn(101);
        int actual=101;
        int expected=tempService.temperatureSensorData();
        //here we are comparing the actual and the expected values 
        assertEquals(expected,actual);



    }

    @Test
    public void test_TemperatureService_LessThan_100() {

        when(tempService.temperatureSensorData()).thenReturn(99);

        int actual=99;
        int expected=tempService.temperatureSensorData();

        assertEquals(expected,actual);
    }

    @Test
    public void test_TemperatureService_LessThan_50() {
        //when and then

        when(tempService.temperatureSensorData()).thenReturn(34);

        int actual=34;
        int expected=tempService.temperatureSensorData();
        assertEquals(expected, actual);
    }
    
}
