import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CelsiusToKelvinFahrenheitTest {
    CelsiusToKelvinFahrenheit celsiusToKelvinFahrenheit;

    @Before
    public void setUp() {
        celsiusToKelvinFahrenheit = new CelsiusToKelvinFahrenheit();
    }

    @Test
    public void convertTemperature_Zero_ReturnCorrectValues() {
        double[] actual = celsiusToKelvinFahrenheit.convertTemperature(0);

        assertArrayEquals(new double[]{273.15, 32.00}, actual, 0);
    }

    @Test
    public void convertTemperature_Sample_ReturnCorrectValues() {
        double[] actual = celsiusToKelvinFahrenheit.convertTemperature(36.50);

        assertArrayEquals(new double[]{309.65000, 97.70000}, actual, 0);
    }

    @Test
    public void convertTemperature_Sample2_ReturnCorrectValues() {
        double[] actual = celsiusToKelvinFahrenheit.convertTemperature(122.11);

        assertArrayEquals(new double[]{395.26000, 251.79800}, actual, 0);
    }
}