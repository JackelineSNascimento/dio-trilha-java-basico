public class OperadoresA6 {
    public static void main(String[] args) {
        String nome1 = "JACKE";
        String nome2 = new String ("JACKE");
        System.out.println(nome1.equals(nome2)); //equals compara conteudo
        
        
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 == numero2){
            System.out.println("A nossa condição é verdadeira.");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("Numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero1 é diferente a numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero1 é maior a numero2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Numero1 é menor a numero2? " + simNao);




    }
}
