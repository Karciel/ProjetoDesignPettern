class CEO extends Gerente {
    @Override
    public void aprovarDespesa(Despesa despesa) {
        if (despesa.getValor() > 1000) {
            System.out.println("CEO aprovou a despesa de R$" + despesa.getValor());
        } else if (sucessor != null) {
            sucessor.aprovarDespesa(despesa);
        }
    }
}
