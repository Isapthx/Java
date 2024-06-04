public class Conta {
    String nome;
    int login;
    float saldo = 0;

    public void depositar(float valor) {
        saldo += valor;
    }
    public void sacar(float valor) {
        saldo -= valor;
    }
}

