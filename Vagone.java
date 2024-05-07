import java.util.Arrays;

class App {
    public static void main(String [] args) {
        Vagone[] array = new Vagone[10];
        for(Vagone vagone : array) {
            System.out.println(vagone);
        }
    }
}

abstract class Vagone{
    
    //peso in tonnellate
    private int peso;

    public Vagone(int p) throws Exception{
        if(p < 0)
            throw new IllegalArgumentException();
        peso = p;
    }

    public int getPeso() {
        return peso;
    }

    

    

}

class Locomotiva extends Vagone{

    //cavalli
    private int cavalli;

    public int getCavalli() {
        return cavalli;
    }

    public Locomotiva(int cavalli, int peso) throws Exception {
        super(peso);
        if(cavalli < 0)
            throw new IllegalArgumentException();
        this.cavalli = cavalli;
    }

    
    
}

class Carrozza extends Vagone{

    //tra 40 e 200;
    private int posti;

    public Carrozza(int posti, int peso) throws Exception {
        super(peso);
        if(posti < 40 || posti > 200)
            throw new IllegalArgumentException();
        this.posti = posti;
    }

    public int getPosti() {
        return posti;
    }

    

}

class Treno {

    private Vagone[] vagoni;
    private int index = 0;

    public Treno(int numeroVagoni) {
        if(numeroVagoni < 1)
            throw new IllegalArgumentException();
        this.vagoni = new Vagone[numeroVagoni];
    }

    public boolean add(Vagone vagone) {
        if(vagone == null)
            return false;
        for(int i = 0; i < vagoni.length; i++){
            if(vagoni[i] == null){
                vagoni[i] = vagone;
                return true;
            }
        }
        return false;
        /*
        if(index >= vagoni.length || vagone == null)
            return false;
        vagoni[index++] = vagone;
        return true; */
    }
    //treno [carrozza p10, carrozza p20, locomotiva p10 c50, locomotiva p30 c20, null]
    public boolean check(){
        int totcavalli = 0, tottonnellate = 0;
        for(var vag : vagoni){
            if(vag == null)
                break;
            tottonnellate += vag.getPeso(); // 70
            if(vag instanceof Locomotiva)
                totcavalli += ((Locomotiva) vag).getCavalli(); //70
        }
        return totcavalli > tottonnellate;
    }

    public int passeggeri() {
        int tot = 0;
        for(var loc : vagoni){
            if(loc == null)
                break;
            if(loc instanceof Carrozza)
                tot += ((Carrozza) loc).getPosti();
        }
        return tot;
    }


}