package com.assigment.scc;

import com.assignment.scc.Encoder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    @Test
    void testEncodeWithNormalString() {
        assertEquals("a2b1c5a3", EncoderTestHelper.encode("aabcccccaaa"));
    }

    @Test
    void testEncodeWithSingleCharacter() {
        assertEquals("a1", EncoderTestHelper.encode("a"));
    }

    @Test
    void testEncodeWithEmptyString() {
        assertEquals("", EncoderTestHelper.encode(""));
    }

    @Test
    void testEncodeWithNull() {
        assertEquals("", EncoderTestHelper.encode(null));
    }

    @Test
    void testEncodeWithNoRepeats() {
        assertEquals("a1b1c1", EncoderTestHelper.encode("abc"));
    }


    static class EncoderTestHelper extends Encoder {
         protected static String encode(String str) {
            return Encoder.encode(str);
        }
    }


}




