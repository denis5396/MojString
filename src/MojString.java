public class MojString {
    private char niz[];



//Kako bi se mogla testirati svaka metoda posebno, potrebno je prvo da prodju testovi za
    //metodu toString() jer ako ona nije ispravna nece se moci testirati druge metode pa
    // ce svi testovi za te metode padati iako su one mozda ispravne

    //Kako bi se funkcija toString() (a i ostale) mogle testirati, potrebno je implementirati
    //konstruktor  public MojString(String nekiString);
    @Override
    public String toString(){
        //Funkcija treba da niz pretvori u string i to vrati
        return "";
    }


    public MojString(){
        //kreira prazan niz znakova duzine 0;

        //NAPOMENA:
        /* uociti da char niz[] nije inicijalizovana vrijednost te ova referenca trenutno ima
        vrijednost null. Sve operacije nad null referencama bacaju izuzetak. Tipa ako se na niz primijeni length
        doci ce do bacanja izuzetka jer niz ne pokazuje na niz vec na nesto sto je null (ne postoji)
         */
    }
    public MojString(String nekiString){
       /*ovaj konstruktor treba da napravi string(niz) koji je identican poslanom stringu*/
    }
    public MojString(char c, int x){
       /*ovaj konstruktor treba da kreira string koji se sastoji od znaka c ponovljenog x puta, tj.
       ako su funckiji poslani parametri 'T' i 5, konstruktor treba da kreira string(niz znakova) "TTTTT"
        */
    }
    public int size(){
        //vraca broj znakova u stringu
        return 0; //izbrisati ovu liniju koda
    }

    public int length(){
        //vraca broj znakova u stringu
        return size();
    }


    public MojString dodajNaString(String nekiString){
        // na postojeci string(tj. niz znakova) dodaje string koji je poslan kao argument
        return this; //vraca referencu na trenutni objekat radi kaskadnog pozivanja
        /*
        Npr.
        MojString d = new MojString();
        int x = d.dodajNaString("asd").size();
        */
    }

    public int wordCount(){
        //Funkcija kao rezultat vraca broj rijeci u stringu.
        //rijec posmatramo kao bilo koju kombinaciju slova i brojeva, npr.
        // asd, as123dada, 123 su 3 rijeci.
        return 0;//izbrisati ovu liniju koda
    }

    public String substring(int pocetniIndeks, int krajnjiIndeks){
        //funkcija kao rezultat vraca dio stringa sa pocetkom i krajem definisanim u parametrima funkcije
        /*
        * Neka je niz sastavljen od sljedecih znakova "Ovo je neki niz"
        * Ako su funkciji poslani kao parametri 3 i 9 funkcija treba da vrati string " je nek"
        * */
        return "";
    }

    public String longestWord(){
        //Funkcija kao rezultat vraca rijec koja je najduza u stringu
        //rijec posmatramo kao bilo koju kombinaciju slova i brojeva, npr.
        // asd, as123dada, 123 su 3 rijeci.
        return "";
    }

    public String shortestWord(){
        //Funkcija kao rezultat vraca rijec koja je najkraca u stringu
        //rijec posmatramo kao bilo koju kombinaciju slova i brojeva, npr.
        // asd, as123dada, 123 su 3 rijeci.
        return "";
    }

    public MojString izbaciString(String uljez){
        //Funkcija treba da izbaci iz stringa(tj. niza znakova) tekst koji je poslan funkciji kao parametar
        return this;
    }

    public MojString replace(char oldChar, char newChar){
        //Funkcija treba da sve oldChar u stringu zamijeni sa newChar-ovima
        return this;
    }

    public boolean equals(MojString nekiString){
        //funkcija treba da vidi da li je ovaj string i string poslan kao parametar isti!
        return true;
    }

    /*
    NAPOMENA: Posto se u Javi ne moze definisati operator +, +=, = i sl... Sve konstrukcije tipa:
    MojString x = new MojString();
    x = "a" + "b";
     nece raditi jer je "a" + "b" = "ab" sto je objekat tipa string, a ne objekat tipa MojString.

     Ovakve stvari se ne mogu napraviti u javi niti ih treba praviti.
    */




}
