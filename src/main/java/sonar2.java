public class sonar2 {
    // metodo somma
    public void somma(int numero){
        int sommatoria;
        sommatoria = numero + numero;
    }

    public static void main(String args[]){
        int numero;
        numero = 4;
        sonar2 s = new sonar2();
        s.somma(numero);
        numero = 5;
        s.somma(numero);

    }
}
