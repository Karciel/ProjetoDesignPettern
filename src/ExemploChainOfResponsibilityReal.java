public class ExemploChainOfResponsibilityReal {
    public static void main(String[] args) {
        Gerente gerenteImediato = new GerenteImediato();
        Gerente diretor = new Diretor();
        Gerente ceo = new CEO();
        gerenteImediato.setSucessor(diretor);
        diretor.setSucessor(ceo);

        Despesa despesaPequena = new Despesa(100);
        gerenteImediato.aprovarDespesa(despesaPequena);

        Despesa despesaMedia = new Despesa(600);
        gerenteImediato.aprovarDespesa(despesaMedia);

        Despesa despesaGrande = new Despesa(2000);
        gerenteImediato.aprovarDespesa(despesaGrande);
    }
}
