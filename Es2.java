
 class Main{
    public static void main(String[] args) {
        print("Ogni test stampa un SUCCESS o un FAILURE, in base all'esito.");
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(6, 0);
        Punto punto3 = new Punto(0, 8);
        try{
            new Segmento(punto3, punto3);
            failure();
        }catch(Exception e){
            success();
        }
        try{
            new Segmento(punto3, null);
            failure();
        }catch(Exception e){
            success();
        }
        Segmento segmento1 = new Segmento(punto1, punto2);
        Segmento segmento2 = new Segmento(punto2, punto3);
        if(segmento1.lunghezza() == 6.0)
            success();
        else failure();
        if(segmento2.lunghezza() == 10.0)
            success();
        else failure();
        LineaSpezzata linea = new LineaSpezzata();
        linea.aggiungiSegmento(segmento1);
        try{
            linea.aggiungiSegmento(segmento1);
            failure();
        }catch(Exception e){
            success();
        }
        linea.aggiungiSegmento(segmento2);
        if(linea.numeroSegmenti() == 2)
            success();
        else failure();
        if(linea.lunghezza() == 16.0)
            success();
        else failure();
        if(linea.lunghezzaMedia() == 8.0)
            success();
        else failure();
    }

    private static void print(String x){
        System.out.println(x);
    }

    private static void success(){
        System.out.println("SUCCESS");
    }

    private static void failure(){
        System.out.println("FAILURE");
    }
 }

 class Punto{
    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

 }

 class Segmento{

    private Punto inizio, fine;

    public Punto getInizio() {
        return inizio;
    }

    public Punto getFine() {
        return fine;
    }

    /**
     * Deve lanciare IllegalArgumentException se
     * uno dei due è null
     * o sono uguali (stessa x e y)
     * @param inizio
     * @param fine
     */
    public Segmento(Punto inizio, Punto fine) {
        //TODO
        this.inizio = inizio;
        this.fine = fine;
    }

    /**
     * restituisce il valore double della
     * lunghezza del segmento. Si ricorda che la distanza 
     * tra due punti (𝑥1, 𝑦1) e (𝑥2, 𝑦2) è
     * definita come radice di |𝑥1 − 𝑥2|^2 + |𝑦1 − 𝑦2|^2.
     * 
     * @return lunghezza del segmento
     */
    public double lunghezza(){
        //TODO
        return 0;
    }

    
 }

 class LineaSpezzata{

    /* 
    • contiene al più 100 segmenti
    • offre il metodo aggiungiSegmento(Segmento s) che aggiunge una segmento alla linea
    spezzata e che solleva una IllegalArgumentException se il valore di s è null o se, nel
    caso la linea spezzata già contenga altri segmenti, il punto final dell’ultimo segmento
    nella linea è diverso dal punto iniziale del segmento s;
    • offre il metodo numeroSegmenti() che ritorna il numero di segmenti attualmente nella
    linea.
    • offre il metodo lunghezza() che ritorna la lunghezza totale della linea (definita come
    somma della lunghezza dei suoi segmenti).
    • offre il metodo lunghezzaMedia() che retituisce la lunghezza media dei segmenti nella
    linea. 
    */

    public void aggiungiSegmento(Segmento s){
        //TODO
    }

    public int numeroSegmenti(){
        //TODO
        return 0;
    }

    public double lunghezza(){
        //TODO
        return 0.0;
    }

    public double lunghezzaMedia(){
        //TODO
        return 0.0;
    }


 }