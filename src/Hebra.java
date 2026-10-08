public class Hebra implements Runnable {

    private VariableCompartida variableCompartida;

    public Hebra(VariableCompartida variableCompartida) {
        this.variableCompartida = variableCompartida;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            variableCompartida.incrementar();
        }
    }
}
