public class MojString {
    private char niz[];
    private boolean jeLiSlovo(char c){
        if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')return true;
        else{
            return false;}
    }



//Kako bi se mogla testirati svaka metoda posebno, potrebno je prvo da prodju testovi za
    //metodu toString() jer ako ona nije ispravna nece se moci testirati druge metode pa
    // ce svi testovi za te metode padati iako su one mozda ispravne

    //Kako bi se funkcija toString() (a i ostale) mogle testirati, potrebno je implementirati
    //konstruktor  public MojString(String nekiString);
    @Override
    public String toString(){
        String rezultat = "";
        for(int i = 0; i < this.niz.length; i++){
            rezultat += this.niz[i];
        }

        //Funkcija treba da niz pretvori u string i to vrati
        return rezultat;
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
        char niz[] = new char[50];
        int brEl = 0;

        for(int i = 0; i < nekiString.length(); i++){
            niz[brEl] = nekiString.charAt(i);
            System.out.print(niz[brEl]);
            brEl++;
        }
        char nizi[] = new char[brEl];
        for(int i = 0; i < brEl; i++){
            nizi[i] = niz[i];
        }

        this.niz = nizi;


       /*ovaj konstruktor treba da napravi string(niz) koji je identican poslanom stringu*/
    }
    public MojString(char c, int x){
       /*ovaj konstruktor treba da kreira string koji se sastoji od znaka c ponovljenog x puta, tj.
       ako su funckiji poslani parametri 'T' i 5, konstruktor treba da kreira string(niz znakova) "TTTTT"
        */
       char niz[] = new char[50];
       int brEl = 0;
       for(int i = 0; i < x; i++){
           niz[brEl] = c;
           System.out.print(niz[brEl]);
           brEl++;
       }
        char nizi[] = new char[brEl];
        for(int i = 0; i < brEl; i++){
            nizi[i] = niz[i];
        }

        this.niz = nizi;


    }
    public int size(){
        //vraca broj znakova u stringu
        int count = 0;
        for(int i = 0; i < this.niz.length; i++){
            count++;
        }

        return count; //izbrisati ovu liniju koda
    }

    public int length(){
        //vraca broj znakova u stringu
        int count = 0;
        for(int i = 0; i < this.niz.length; i++){
            count++;
        }

        return count;
    }


    public MojString dodajNaString(String nekiString){
        // na postojeci string(tj. niz znakova) dodaje string koji je poslan kao argument

        char niz[] = new char[this.niz.length + nekiString.length()];
        char nizs[] = new char[nekiString.length()];
        int brEl = 0;

        for(int i = 0; i < nizs.length; i++){
            nizs[i] = nekiString.charAt(i);
        }

        for(int i = 0; i < niz.length; i++) {
            if (i >= this.niz.length) {
                niz[i] = nizs[brEl];
                brEl++;
            }
            else if(i <= this.niz.length){
            niz[i] = this.niz[i];
            }
        }
        for(int i = 0; i < niz.length; i++){
            System.out.print(niz[i]);
        }

        this.niz = niz;

        return this; //vraca referencu na trenutni objekat radi kaskadnog pozivanja
        /*
        Npr.
        MojString d = new MojString();
        int x = d.dodajNaString("asd").size();
        */
    }

    public int wordCount() {
        //Funkcija kao rezultat vraca broj rijeci u stringu.
        //rijec posmatramo kao bilo koju kombinaciju slova i brojeva, npr.
        // asd, as123dada, 123 su 3 rijeci.
        int count = 0;
        int i = 0;
        while(i < this.niz.length){

            while(i < this.niz.length && jeLiSlovo(this.niz[i])){
                i++;
            }
            count++;

            while(i < this.niz.length && !jeLiSlovo(this.niz[i])){
                i++;
            }
        }
            return count;//izbrisati ovu liniju koda
    }


    public String substring(int pocetniIndeks, int krajnjiIndeks){
        //funkcija kao rezultat vraca dio stringa sa pocetkom i krajem definisanim u parametrima funkcije
        /*
        * Neka je niz sastavljen od sljedecih znakova "Ovo je neki niz"
        * Ako su funkciji poslani kao parametri 3 i 9 funkcija treba da vrati string " je nek"
        * */
        String rezultat = "";
        for(int i = pocetniIndeks; i <= krajnjiIndeks; i++){
            rezultat += this.niz[i];

        }
        return rezultat;
    }

    public String longestWord(){
        //Funkcija kao rezultat vraca rijec koja je najduza u stringu
        //rijec posmatramo kao bilo koju kombinaciju slova i brojeva, npr.
        // asd, as123dada, 123 su 3 rijeci.
        String rezultat = "";
        String rezultatx = "";
        int i = 0;
        int j = 0;
        int min = 0;
        int currentLength;
        int maxLength = 0;
        int maxStartIndex = 0;
        while(i < this.niz.length){

            while(i < this.niz.length && jeLiSlovo(this.niz[i])){
                rezultat += this.niz[i];
                i++;
            }
            rezultat += " ";

            while(i < this.niz.length && !jeLiSlovo(this.niz[i])){
                i++;
            }
        }
        while(j < rezultat.length()){
            if(j < rezultat.length() && rezultat.charAt(j) != ' '){
                j++;
            }
            else{
                currentLength = j-min;
                if(currentLength > maxLength){
                    maxLength = j;
                    maxStartIndex = min;
                }
                j++;
                min = j;
            }

        }
        for(i = maxStartIndex; i < maxLength; i++){

            rezultatx += rezultat.charAt(i);

        }

        return rezultatx;
    }

    public String shortestWord(){
        //Funkcija kao rezultat vraca rijec koja je najkraca u stringu
        //rijec posmatramo kao bilo koju kombinaciju slova i brojeva, npr.
        // asd, as123dada, 123 su 3 rijeci.
        String rezultat = "";
        String rezultatx = "";
        int i = 0;
        int j = 0;
        int min = 0;
        int currentLength;
        int minLength;
        int minStartIndex = 0;
        while(i < this.niz.length){

            while(i < this.niz.length && jeLiSlovo(this.niz[i])){
                rezultat += this.niz[i];
                i++;
            }
            rezultat += " ";

            while(i < this.niz.length && !jeLiSlovo(this.niz[i])){
                i++;
            }
        }
        minLength = rezultat.length();
        while(j < rezultat.length()){
            if(j < rezultat.length() && rezultat.charAt(j) != ' '){
                j++;
            }
            else{
                currentLength = j-min;
                if(currentLength < minLength){
                    minLength = currentLength;
                    minStartIndex = min;
                }
                j++;
                min = j;
            }

        }
        for(i = minStartIndex; i < (minLength + minStartIndex); i++){

            rezultatx += rezultat.charAt(i);

        }

        return rezultatx;
    }



    public MojString izbaciString(String uljez) {
        //Funkcija treba da izbaci iz stringa(tj. niza znakova) tekst koji je poslan funkciji kao parametar

        char nizs[] = new char[this.niz.length-uljez.length()];
        int brEl = 0;
        int brEl1 = 0;
        int i = 0;
        int j;
        int counter = 0;
        boolean trig = false;
        while(i < this.niz.length) {

            if (this.niz[i] == uljez.charAt(0)) {
                if (i <= this.niz.length-uljez.length()) {
                    j = i;
                    if(!jeLiSlovo(this.niz[j-1])) {
                        while (this.niz[j] == uljez.charAt(brEl1) && counter < uljez.length()) {
                            j++;
                            brEl1++;
                            counter++;
                            if (this.niz[j] != uljez.charAt(brEl1)) {
                                brEl1 = 0;
                                counter = 0;
                                break;
                            }
                            if (this.niz[j] == uljez.charAt(uljez.length() - 1)) {

                                brEl1 = 0;
                                counter = 0;
                                i += uljez.length();
                                i++;
                                trig = true;

                            }

                        }
                    }

                }

            }

            if (i < this.niz.length) {
                if (!trig) {

                    nizs[brEl] = this.niz[i];
                    brEl++;
                    i++;
                }
            }
            trig = false;
        }

        this.niz = nizs;
        return this;}

    public MojString replace(char oldChar, char newChar){
        //Funkcija treba da sve oldChar u stringu zamijeni sa newChar-ovima
        for(int i = 0; i < this.niz.length; i++){
            if(this.niz[i] == oldChar){
                this.niz[i] = newChar;
            }
        }

        return this;
    }

    public boolean equals(String nekiString){
        //funkcija treba da vidi da li je ovaj string i string poslan kao parametar isti!

        char niz[] = new char[nekiString.length()];
        for(int i = 0; i < niz.length; i++){
            niz[i] = nekiString.charAt(i);
        }

        for(int i = 0; i < this.niz.length; i++){
            if(this.niz[i] != niz[i]){
                return false;
                }
        }
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
