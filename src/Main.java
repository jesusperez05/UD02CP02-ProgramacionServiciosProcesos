public class Main {
    static void main() throws InterruptedException {

        VariableCompartida variableCompartida = new VariableCompartida();

        Hebra h1 = new Hebra(variableCompartida);
        Hebra h2 = new Hebra(variableCompartida);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(variableCompartida.getV());
    }
}