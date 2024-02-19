public class ContaBancaria {
    String titularDaConta;
    String numeroDaConta;
    Double saldoDaConta;

    public void depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            saldoDaConta += valorDepositado;
            System.out.println("Depósito de " + valorDepositado + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void  sacar (double valorSaque){
        saldoDaConta = saldoDaConta - valorSaque;
    }

    public double exibirSaldo (){
        return saldoDaConta;
    }
}
