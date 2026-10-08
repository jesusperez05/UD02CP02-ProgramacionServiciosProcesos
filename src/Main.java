public class Main {
    static void main() throws InterruptedException {

        VariableCompartida variableCompartida = new VariableCompartida();

        Thread t1 = new Thread(new Hebra(variableCompartida));
        Thread t2 = new Thread(new Hebra(variableCompartida));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(variableCompartida.getV());

        // Al incrementar pueden perderse algunos, ya que varias hebras modifican la misma variable al mismo tiempo
    }
}