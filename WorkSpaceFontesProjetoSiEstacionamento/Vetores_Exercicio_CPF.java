
public class Vetores_Exercicio_CPF {

	public static void main(String[] args) {

		// Comentarios
		// Indice sempre inicia no 0. Exemplo 10 (0...9)
		// Lembrar de ler atentamente o enunciado e inicializar as variais com os
		// valores corretos.
		// int CPF[] = { 1, 2, 3, 4, 5, 7, 7, 8, 9, 5, 4};
		int CPF[] = { 3, 7, 4, 3, 4, 5, 7, 9, 8, 9, 7 };
		int i, soma, resto, peso, DV1i, DV2i, DV1c, DV2c;

		DV1i = CPF[9];
		DV2i = CPF[10];

		//Cálculo do primeiro digito verificador
		peso = 10;
		soma = 0;

		for (i = 0; i <= 8; i++) {
			soma = soma + CPF[i] * peso;
			peso--;
		}

		resto = soma % 11;
		if (resto < 2)
			DV1c = 0;
		else
			DV1c = 11 - resto;

		//Cálculo do segundo digito verificador
		peso = 11;
		soma = 0;

		for (i = 0; i <= 9; i++) {
			soma = soma + CPF[i] * peso;
			peso--;
		}

		resto = soma % 11;
		if (resto < 2)
			DV2c = 0;
		else
			DV2c = 11 - resto;

		if ((DV1i == DV1c) && (DV2i == DV2c))
			System.out.println("CPF VÁLIDO!");
		else
			System.out.println("CPF INVÁLIDO!");
	}

}
