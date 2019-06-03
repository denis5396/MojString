import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MojStringTest {


    @Test
    void testKonstruktoraSaParametromString(){
        MojString string = new MojString("neki String");
        assertEquals("neki String",string.toString());
    }

    @Test
    void toString1() {
        MojString string = new MojString("neki String");
        assertEquals("neki String",string.toString());
    }
    @Test
    void testKonstruktoraBezParametara(){
        MojString string = new MojString();
        assertEquals("",string.toString());
    }
    @Test
    void testKonstruktoraSaParametrimaCiX(){
        MojString string = new MojString('a',3);
        assertEquals("aaa",string.toString());
    }
    @Test
    void size() {
        MojString string = new MojString("neki ");
        assertEquals(5,string.size());
    }

    @Test
    void length() {
        MojString string = new MojString("");


        assertEquals(0,string.length());
    }

    @Test
    void dodajNaString() {
        MojString string = new MojString("Ovo je neki string!");
        string.dodajNaString(" I mi cemo ga testirati!");
        assertEquals("Ovo je neki string! I mi cemo ga testirati!",string.toString());
    }

    @Test
    void wordCount() {
        MojString string = new MojString(",,.-,.-Ovo      j24324e ne4565ki ,,,,,.,-,.-.,.-string!");
        assertEquals(4,string.wordCount());
    }

    @Test
    void substring() {
        MojString string = new MojString("Ovo je neki string!");
        assertEquals(" je nek",string.substring(3,9));
    }

    @Test
    void longestWord() {
        MojString string = new MojString("Ovo je neki string!");
        assertEquals("string",string.longestWord());
    }

    @Test
    void shortestWord() {
        MojString string = new MojString("Ovo je neki string!");
        assertEquals("je",string.shortestWord());
    }

    @Test
    void izbaciString() {
        MojString string = new MojString("Ovo je neki string!");
        assertEquals("Ovo je string!",string.izbaciString("neki ").toString());
    }

    @Test
    void replace() {
        MojString string = new MojString("Ovo je neki string!");
        assertEquals("Ovo je string!".replace('a','T'),string.replace('a','T').toString());
    }
    @Test
    void equals() {
        MojString string = new MojString("Ovo je neki string!");
        MojString string1 = new MojString("Ovo je neki string!");
        assertEquals(true,string.equals(string1));
    }
}