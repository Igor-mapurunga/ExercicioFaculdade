
public class Main {
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.titularDaConta = "Igor Mapurunga";
        minhaConta.saldoDaConta = 5000.00;
        minhaConta.numeroDaConta = "08102581";

        double valorSaque = 100;
        double valorDepositado = 1000;

        minhaConta.sacar(valorSaque);

        minhaConta.depositar(valorDepositado);

        System.out.println(minhaConta.exibirSaldo());
        //System.out.println("O titular da conta é:" + minhaConta.titularDaConta + ", O seu saldo é de:"+ String.format("%.2f",(minhaConta.saldoDaConta)) + ", O numero da sua conta é: " + minhaConta.numeroDaConta);
        }
    }
