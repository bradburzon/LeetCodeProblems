import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeFangIPAddressTest {

    DeFangIPAddress deFangIPAddress;

    @Before
    public void setup(){
        deFangIPAddress = new DeFangIPAddress();
    }

    @Test
    public void deFangIPAddress_EmptyString_ReturnEmptyString(){
        String actual = deFangIPAddress.deFangIPAddress("");

        assertEquals("", actual);
    }

    @Test
    public void deFangIPAddress_IPString_ReturnDeFangedIP(){
        String ip = "1.1.1.1";

        String actual = deFangIPAddress.deFangIPAddress(ip);

        assertEquals("1[.]1[.]1[.]1", actual);
    }

    @Test
    public void deFangIPAddress_AnotherIPString_ReturnDeFangedIP(){
        String ip = "255.100.50.0";

        String actual = deFangIPAddress.deFangIPAddress(ip);

        assertEquals("255[.]100[.]50[.]0", actual);
    }
}