public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 9999;
        double valorSolicitado = 1213;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        } else {
            System.out.println("valor insuficiente");
        }
    }
}
