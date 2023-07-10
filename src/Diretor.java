class Diretor extends Gerente {
    @Override
    public void aprovarDespesa(Despesa despesa) {
        if (despesa.getValor() > 500 && despesa.getValor() <= 1000) {
            System.out.println("Diretor aprovou a despesa de R$" + despesa.getValor());
        } else if (sucessor != null) {
            sucessor.aprovarDespesa(despesa);
        }
    }
}
