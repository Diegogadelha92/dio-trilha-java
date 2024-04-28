import java.util.Scanner;

 class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println(" Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println(" Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println(" Saldo insuficiente para saque de R$" + valor);
        }
    }

    public void exibirSaldo() {
        System.out.println(" Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.print(" Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);

        conta.exibirSaldo();

        System.out.print(" Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print(" Digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        scanner.close();
    }
}
