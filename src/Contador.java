
public class Contador {
	public static void main(String[]args) throws Exception{
		
		
		try {
            if (args.length != 2) {
                throw new ParametrosInvalidosException("Dois parâmetros são necessários.");
            }

            int inicio = Integer.parseInt(args[0]);
            int fim = Integer.parseInt(args[1]);

            if (inicio > fim) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = inicio; i <= fim; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    
		
	}
}
