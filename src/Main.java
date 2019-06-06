public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //MojString obj = new MojString('d',5);
        MojString obj = new MojString("Ovo je neki niz xd");
        System.out.print(obj.toString());
        System.out.print(obj.size());
        System.out.print(obj.length());
        //System.out.print(obj.dodajNaString("dsds"));
        System.out.println("");
        MojString obj1 = new MojString("Ovo je neki niz");
        System.out.println("");
        //System.out.print(obj1.substring(3,9));
        System.out.println("");
        System.out.println("");
        //System.out.print(obj.equals("Ovo je neki niz"));
        System.out.print(obj.wordCount());
        System.out.print(obj.longestWord());
        System.out.print(obj.shortestWord());
        System.out.println("");
        System.out.print(obj1.izbaciString("neki"));
    }
}
