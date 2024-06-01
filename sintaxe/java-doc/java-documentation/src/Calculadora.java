/**
 *  <h1>Calculadora</h1>
 * A calculadora realiza operações matémáticas entre números inteiros
 * <p>
 * <strong>Note:</strong> Leia atentamente a documentação desta classe
 * para disfrutar dos recursos oferecidos pelo autor
 * 
 * @author Isaac Pires
 * @version 1.0
 * @since 01/06/2024
 */
public class Calculadora {

    /**
     * Esse método é utilizado para somar dois números inteiros
     * @param numeroUm
     * @param numeroDois
     * @return int o resultado desse método é a soma de dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
    /**
     * Esse método é utilizado para subtrair dois números
     * @param numeroUm
     * @param numeroDois
     * @return int o resultado desse método é subtração entre dois números
     */
    public int subtrair(int numeroUm, int numeroDois) {
        return numeroUm - numeroDois;
    }
    /**
     * Esse método é utilizado para multiplicar dois números
     * @param numeroUm
     * @param numeroDois
     * @return int o resultado desse método é a multiplicação entre dois números
     */
    public int multiplicar(int numeroUm, int numeroDois) {
        return numeroUm * numeroDois;
    }
    /**
     * Esse método é utilizado para dividir dois números
     * @param numeroUm
     * @param numeroDois
     * @return int o resultado desse métodos é a divisão inteira de dois números
     */
    public int dividir(int numeroUm, int numeroDois) {
        return numeroUm / numeroDois;
    }
}
