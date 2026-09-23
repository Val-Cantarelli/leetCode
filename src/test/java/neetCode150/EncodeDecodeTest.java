package neetCode150;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class EncodeDecodeTest {

    private final EncodeDecode codec = new EncodeDecode();

    @Test
    void encodesStringsWithTheirLengths() {
        assertEquals("4#casa7#amarela",
                codec.encode(List.of("casa", "amarela")));
    }

    @Test
    void encodesEmptyListAndEmptyStringDifferently() {
        assertEquals("", codec.encode(List.of()));
        assertEquals("0#", codec.encode(List.of("")));
    }

    @Test
    void decodesDelimiterInsideWordAndEmptyWord() {
        assertEquals(List.of("a#b", ""),
                codec.decode("3#a#b0#"));
    }

    @Test
    void decodesMultiDigitLength() {
        assertEquals(List.of("abcdefghij"),
                codec.decode("10#abcdefghij"));
    }

    @Test
    void roundTripPreservesOrderAndRepeatedStrings() {
        List<String> original = List.of("", "a#b", "a#b", "123", "");

        assertEquals(original, codec.decode(codec.encode(original)));
    }

    @Test
    void decodesEmptyInputAsEmptyList() {
        assertEquals(List.of(), codec.decode(""));
    }
}