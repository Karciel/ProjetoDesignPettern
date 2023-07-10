
abstract class Gerente {
    protected Gerente sucessor;

    public void setSucessor(Gerente sucessor) {
        this.sucessor = sucessor;
    }

    abstract public void aprovarDespesa(Despesa despesa);
}