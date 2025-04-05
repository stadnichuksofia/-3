package roman;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanConverterTest {

    @Test void when_1_then_I()       { assertEquals("I", IntegerToRomanConverter.convertToRoman(1)); }
    @Test void when_2_then_II()      { assertEquals("II", IntegerToRomanConverter.convertToRoman(2)); }
    @Test void when_3_then_III()     { assertEquals("III", IntegerToRomanConverter.convertToRoman(3)); }
    @Test void when_4_then_IV()      { assertEquals("IV", IntegerToRomanConverter.convertToRoman(4)); }
    @Test void when_5_then_V()       { assertEquals("V", IntegerToRomanConverter.convertToRoman(5)); }
    @Test void when_6_then_VI()      { assertEquals("VI", IntegerToRomanConverter.convertToRoman(6)); }
    @Test void when_9_then_IX()      { assertEquals("IX", IntegerToRomanConverter.convertToRoman(9)); }
    @Test void when_10_then_X()      { assertEquals("X", IntegerToRomanConverter.convertToRoman(10)); }
    @Test void when_12_then_XII()    { assertEquals("XII", IntegerToRomanConverter.convertToRoman(12)); }
    @Test void when_14_then_XIV()    { assertEquals("XIV", IntegerToRomanConverter.convertToRoman(14)); }
    @Test void when_15_then_XV()     { assertEquals("XV", IntegerToRomanConverter.convertToRoman(15)); }
    @Test void when_19_then_XIX()    { assertEquals("XIX", IntegerToRomanConverter.convertToRoman(19)); }
    @Test void when_20_then_XX()     { assertEquals("XX", IntegerToRomanConverter.convertToRoman(20)); }
    @Test void when_27_then_XXVII()  { assertEquals("XXVII", IntegerToRomanConverter.convertToRoman(27)); }
    @Test void when_40_then_XL()     { assertEquals("XL", IntegerToRomanConverter.convertToRoman(40)); }
    @Test void when_44_then_XLIV()   { assertEquals("XLIV", IntegerToRomanConverter.convertToRoman(44)); }
    @Test void when_48_then_XLVIII() { assertEquals("XLVIII", IntegerToRomanConverter.convertToRoman(48)); }
    @Test void when_49_then_XLIX()   { assertEquals("XLIX", IntegerToRomanConverter.convertToRoman(49)); }
    @Test void when_50_then_L()      { assertEquals("L", IntegerToRomanConverter.convertToRoman(50)); }
    @Test void when_58_then_LVIII()  { assertEquals("LVIII", IntegerToRomanConverter.convertToRoman(58)); }
    @Test void when_90_then_XC()     { assertEquals("XC", IntegerToRomanConverter.convertToRoman(90)); }
    @Test void when_98_then_XCVIII() { assertEquals("XCVIII", IntegerToRomanConverter.convertToRoman(98)); }
    @Test void when_100_then_C()     { assertEquals("C", IntegerToRomanConverter.convertToRoman(100)); }
    @Test void when_108_then_CVIII() { assertEquals("CVIII", IntegerToRomanConverter.convertToRoman(108)); }
    @Test void when_400_then_CD()    { assertEquals("CD", IntegerToRomanConverter.convertToRoman(400)); }
    @Test void when_500_then_D()     { assertEquals("D", IntegerToRomanConverter.convertToRoman(500)); }
    @Test void when_900_then_CM()    { assertEquals("CM", IntegerToRomanConverter.convertToRoman(900)); }
    @Test void when_1000_then_M()    { assertEquals("M", IntegerToRomanConverter.convertToRoman(1000)); }
    @Test void when_1994_then_MCMXCIV() { assertEquals("MCMXCIV", IntegerToRomanConverter.convertToRoman(1994)); }
    @Test void when_2024_then_MMXXIV() { assertEquals("MMXXIV", IntegerToRomanConverter.convertToRoman(2024)); }
    @Test void when_3000_then_MMM()     { assertEquals("MMM", IntegerToRomanConverter.convertToRoman(3000)); }
}
