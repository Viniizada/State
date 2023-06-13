class Contexto {
    private State estadoAtual;

    public Contexto() {

        estadoAtual = new EstadoA();
    }

    public void setEstado(State estado) {
        estadoAtual = estado;
    }

    public void executar() {
        estadoAtual.executar();
    }
}
