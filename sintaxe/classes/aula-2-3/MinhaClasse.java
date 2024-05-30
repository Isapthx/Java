



public class MinhaClasse {

    public static void main(String [] args) {
        
        String primeroNome = "Isaac";
        String segundoNome = "Emanuel";
        String fullName;

        fullName = nomeCompleto(primeroNome, segundoNome);

        System.out.println(fullName);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        // concat() - método BuiltIn que concatena duas strings
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
