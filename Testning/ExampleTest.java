import org.junit.Assert;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    //tar tecken och space som konsonant
    @DisplayName("Counts the number of consonants in the given String")
    void testCountConsonats() {
        //metoden kan inte hantera null
        //assertEquals(5, Iqh.countConsonants(null));
        // kollar inmatning av konsonanter av hela raden
        assertEquals(5, Iqh.countConsonants("abcdefg"));
        // kollar att inmatning inte är konsonanter
        assertNotEquals(7, "123!#¤%");
    }


    @DisplayName("Räknar antalet vokaler i den givna strängen")
    @Test
    void testCountVowels() {
        //metoden kan inte hantera null
        //assertEquals("asdfghjk", Iqh.countVowels(null));
        // kollar inmatningen och räknar bara antalet vokaler i det givna strängen dvs, expected vokaler
        assertEquals(2, Iqh.countVowels("gfedcba%"));
    }

    @DisplayName("Inverterar den givna strängen")
    @Test
    void testInvert() {
        //metoden kan inte hantera null
        //assertEquals("cba", Iqh.invert(null));
        // kollar att strängen av inmatningen är omvänd annars testet kommer inte funka
        assertEquals("abcdefg", Iqh.invert("gfedcba"));

    }


    @DisplayName("Ger den första halvan av strängen om längden är jämn, annars null om den är udda")
    @Test
    void testLowerHalf() {
        //metoden kan inte hantera null
        //assertEquals("123", Iqh.lowerHalf(null));
        // räknar den första halva av inmatningen
        assertEquals("123", Iqh.lowerHalf("123456"));
        assertEquals(null, Iqh.lowerHalf("1234567"));
        assertNotEquals("123", Iqh.lowerHalf("1234567"));

    }


    @DisplayName("Läser från fil och sammanfogar raderna till en lång sträng")
    @Test
    void testReadString() {
        //metoden kan inte hantera null
        //assertEquals("aabbccddffgg", Iqh.readString(null));
        // läser från en file rad efter rad
        assertEquals("aabbccddffgg", Iqh.readString("file.txt"));
        assertNotEquals("aabbccddff", Iqh.readString("file.txt"));
        assertNotEquals("aa bb cc dd ff", Iqh.readString("file.txt"));
    }


    //Denna metod hittas inte i projektet (kan inte anropas)
    @DisplayName("Ta bort vokalerna från en text")
    @Ignore
    @Test
    void testRemoveVowels() {
    }


    @DisplayName("Returnerar strängen med alla tecken i slumpmässig ordning")
    //@Test
    @RepeatedTest(5)
    void testScatterString() {
        //testar och metoden kan inte hantera null
        //assertEquals(null, Iqh.scatterString(null));
        //om strängen är noll så retunerar den noll
        assertEquals("", Iqh.scatterString(""));
        //testar att den inte intamning kan försvinna
        assertNotEquals("1", Iqh.scatterString("12356"));
        //testar att strängens tecken inte kan ändras
        assertNotEquals("##**||££", Iqh.scatterString("##**||££"));
        assertNotEquals("111111", Iqh.scatterString("12356"));
        assertNotEquals("123456789", Iqh.scatterString("123456789"));
        System.out.println("Expected: 123456789 Actual: " + Iqh.scatterString("123456789"));

       /* String[] kontrollCase ={
                "ääååööuussiittwwxxlÖÖ",
                "abcdefgwwlqrpåäöjhgfl", // abcdababcabcdääååööuussiittwwxxlÖÖabcdefgwwlqrpåäöjhgfl
        };
        char[] testCharsIn, actualCharsOut;
         for(int i = 0; i < kontrollCase.length;  i++){
             System.out.println("kontrollCase" + (i+1) + ":");
             testCharsIn = kontrollCase[i].toCharArray();
             Arrays.sort(testCharsIn);

             actualCharsOut = Iqh.scatterString(kontrollCase[i]).toCharArray();
             Arrays.sort(actualCharsOut);
             assertArrayEquals(testCharsIn,actualCharsOut);



         }
*/
    }


    @DisplayName("returnera längden på den givna strängen")
    @Test
    void testSize() {
        //metoden kan inte hantera null
        //assertEquals(0, Iqh.size(null));
        assertEquals(3, Iqh.size("abc"));
        assertNotEquals(3, Iqh.size("ABCD"));
        assertEquals(9, Iqh.size("!#¤%&/())"));
        assertEquals(1, Iqh.size(" "));
        assertEquals(0, Iqh.size(""));
        Assert.assertEquals(3, Iqh.size("@/*"));
    }


    //Denna metod finns inte eller är privat så vi kan inte anropa den
    @DisplayName("Unzips a string meaning abcdef -> [\"ace\", \"bdf\"]")
    @Ignore("Iqh.unzip() inaccessible")
    @Test
    public void testUnzip() {
        String[] kontrollCases = {
                "",
                " ",
                "a",
                "b",
                "c",
                "b",
                "ab",
                "abc",
                "abcd",
                "ääååööuussiittwwxxlÖÖ",
                "abcdefgwwlqrpåäöjhgfl",
        };
        String[][] expected = {
                {"", ""},
                {" ", ""},
                {"a", ""},
                {"a", "b"},
                {" ", "a"},
                {"a", " "},
                {"0", "1"},
                {"ace", "bdf"},
                {"ace", "bd"},
                {"äé", "ñå"},
                {"KLMNYR", "GFLQPT"},
        };
        for (int i = 0, len = kontrollCases.length; i < len; i++) {
            System.out.println("kontrollCase" + (i + 1) + ":");
            //assertArrayEquals(expected[i], Iqh.unzip(kontrollCases));

        }
    }

    @DisplayName("Ger den andra halvan av strängen om längden är jämn annars null")
    @Test
    void testUpperHalf() {
        //metoden kan inte anropas med null
        //assertEquals("123",Iqh.upperHalf(null));
        assertEquals("JKL1234", Iqh.upperHalf("ADCVFGHJKL1234"));
        assertEquals("d1234", Iqh.upperHalf("aabbdd1234"));
        assertNotEquals(null, Iqh.upperHalf("aabbdd1234"));
    }


    @org.junit.Test
    @DisplayName("zips ihop två strängar \"Abc, def\" -> \"Adbecf\" Första tecknet från det första argumentet.")
    @Test //(expected =NullPointerException.class)
    public void testZip() {
        //metoden kan inte hantera null
        //assertEquals("abcdef", Iqh.zip(null, null));
        //assertEquals("abcdef", Iqh.zip("abc", null));
        assertEquals("Adbecf", Iqh.zip("Abc", "def"));
        assertNotEquals("Hajapådig", Iqh.size("Hajainte"));


    }
}