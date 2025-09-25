package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeNumberCheckTest {
    @Test
    void testCheckNumberReturnNotPrime() {
        assertEquals("Not Prime", PrimeNumberCheck.checkNumber(4));
        assertEquals("Not Prime", PrimeNumberCheck.checkNumber(10));
        assertEquals("Not Prime", PrimeNumberCheck.checkNumber(50));
        assertEquals("Not Prime", PrimeNumberCheck.checkNumber(3000));
        assertEquals("Not Prime", PrimeNumberCheck.checkNumber(1));
        assertEquals("Not Prime", PrimeNumberCheck.checkNumber(6));
    }

    @Test
    void testCheckNumberReturnPrime(){
        assertEquals("Prime", PrimeNumberCheck.checkNumber(13));
        assertEquals("Prime", PrimeNumberCheck.checkNumber(17));
        assertEquals("Prime", PrimeNumberCheck.checkNumber(11));
        assertEquals("Prime", PrimeNumberCheck.checkNumber(19));
        assertEquals("Prime", PrimeNumberCheck.checkNumber(23));
    }
}
