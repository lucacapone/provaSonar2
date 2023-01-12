package pippo;

public class Sonar2 {
    // metodo somma
    public void somma(int numero){
        numero= numero + numero;
    }

    public static void main(String args[]){
        int numero;
        numero = 4;
        Sonar2 s = new Sonar2();
        s.somma(numero);
        numero = 5;
        s.somma(numero);

    }
}
