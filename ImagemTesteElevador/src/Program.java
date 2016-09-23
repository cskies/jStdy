
public class Program {
	public static void main(String[] args) {
	
		int andarAtual = 0; //1
		boolean portaFechada = false; //1 -- //3 true com rota setada
		int[] status = new int[1]; //item3                  0 parado / 1 subindo / 2 descendo
		int[] rota; //5
		int capacidade = 7;
		
		
		if (!portaFechada) {
			status[0] = 0;
			System.out.println("Embarque de passageiros permitido");
			
			if (!(capacidade <= 8)) { //esse num representa a capacidade max de pessoas
				
				System.out.println("A rota nao pode ser definida, "
						+ "favor diminuir a quantidade de passageiros ");
			}
			else {
				portaFechada = true;
			}
			
			
		}
		else {
			//mudar pra subind / desc porta fecha
		}
		
		
		
		
		
		
		if (status[0] == 1) {
			// rota para subir passo 3
		}
		else if (status[0] == 2) {
			// rota para descer
		}
		
		
		
	}
}
