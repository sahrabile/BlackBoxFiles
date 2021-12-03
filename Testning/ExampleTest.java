import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    //tar tecken och space som konsonant
    @DisplayName("Counts the number of consonants in the given String")
    void testCountConsonats(){
        assertEquals(5,Iqh.countConsonants("abcdefg"));
        assertNotEquals(7, "123!#¤%");

    }


    @DisplayName("Räknar antalet vokaler i den givna strängen")
    @Test
    void testCountVowels(){
        assertEquals(2,Iqh.countVowels("gfedcba%"));
    }
    @DisplayName("Inverterar den givna strängen")
    @Test
    void testInvert() {
        assertEquals("abcdefg",Iqh.invert("gfedcba"));

    }


    @DisplayName("Ger den första halvan av strängen (om längden är jämn) annars null")
    @Test
    void testLowerHalf() {
        assertEquals("123", Iqh.lowerHalf("123456"));
        assertEquals(null, Iqh.lowerHalf("1234567"));
        assertNotEquals("123", Iqh.lowerHalf("1234567"));

    }


    @DisplayName("Läser från fil och sammanfogar raderna till en lång sträng")
    @Test
    void testReadString() throws IOException {
        assertEquals("aabbccddffgg", Iqh.readString("file.txt"));
        assertNotEquals("aabbccddff", Iqh.readString("file.txt"));
        assertNotEquals("aa bb cc dd ff", Iqh.readString("file.txt"));
    }


    //Denna metod hittas inte i projektet (kan inte anropas)
    @DisplayName("Ta bort vokalerna från en text")
    @Test
    void testRemoveVowels() {
    }


    @DisplayName("Returnerar strängen med alla tecken i slumpmässig ordning")
    @RepeatedTest(5)
    void testScatterString() {
        assertNotEquals("1", Iqh.scatterString("12356"));
        assertNotEquals("111111", Iqh.scatterString("12356"));
        assertNotEquals("123456789", Iqh.scatterString("123456789"));

    }


    @DisplayName("returnera längden på den givna strängen")
    @Test
    void testSize() {
        assertEquals(3,Iqh.size("abc"));
        assertNotEquals(3,Iqh.size("ABCD"));
        assertEquals(9,Iqh.size("!#¤%&/())"));
        assertEquals(1, Iqh.size(" "));
        assertEquals(0, Iqh.size(""));
    }


    //Denna metod finns inte eller är privat så vi kan inte anropa den
    @DisplayName("Unzips a string meaning abcdef -> [\"ace\", \"bdf\"]")
    @Test
    void testUnzip(){
    }


    @DisplayName("Ger den andra halvan av strängen om längden är jämn annars null")
    @Test
    void testUpperHalf() {
        assertEquals("JKL1234",Iqh.upperHalf("ADCVFGHJKL1234"));
        assertEquals("d1234",Iqh.upperHalf("aabbdd1234"));
        assertNotEquals(null,Iqh.upperHalf("aabbdd1234"));
    }


    @DisplayName("zips ihop två strängar \"Abc, def\" -> \"Adbecf\" Första tecknet från det första argumentet.")
    @Test
    void zip(){
        assertEquals("Adbecf", Iqh.zip("Abc", "def"));


    }
}