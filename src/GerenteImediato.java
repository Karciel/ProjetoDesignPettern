class GerenteImediato extends Gerente {
    @Override
    public void aprovarDespesa(Despesa despesa) {
        if (despesa.getValor() <= 500) {
            System.out.println("Gerente Imediato aprovou a despesa de R$" + despesa.getValor());
        } else if (sucessor != null) {
            sucessor.aprovarDespesa(despesa);
        }
    }
}
