import java.util.Scanner;

class App{

    public static Scanner in = new Scanner(System.in);

    public String nome = "Nome";

    public static void main(String [] args) {
        App app = new App();
        //app.start();
        System.out.println(app);
    }
    /**
     * 1.nome della variabile
     * 2.errore
     * 3.indirizzo in memoria
     * 4.null
     */

    public void start() {
        String input = in.next();
        Object dalmata = new Dalmata();


        if(!input.equals("exit"))
            start();
    }

    @Override
    public String toString(){
        return this.nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        App other = (App) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

}

class A {
    public static A def = new A();
    public int x;
    public float y;
    public void m1(){}
    public void m2(){}
    public void m3(){}
}

class Cane{}

class Dalmata extends Cane{}