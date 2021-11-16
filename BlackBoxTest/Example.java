public class Example {


    public static void main(String[] args) {
        String myString = "John Lennon";
        String myString2 = "George Harrison";
        int vow = Iqh.countVowels(myString);
        System.out.println("No vowels: "+vow);
        int con = Iqh.countConsonants(myString);
        System.out.println("No consonants: "+con);
        String scattered =  Iqh.scatterString(myString2);
        System.out.println(myString2 + " scattered " + scattered);

        String zipped = Iqh.zip(myString, myString2);
        System.out.println("example of a zip: " +zipped);
    }
}
