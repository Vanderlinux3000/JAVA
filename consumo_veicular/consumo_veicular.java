public class consumo_veicular{
	public static void main(String[] args){
		/*Declaração de variáveis*/
		double combustivel, combustivelrestante, totalcombustivel, distancia, distanciapercorrida, kmlitro, consumomedio,mediac,restante;
		int totaldeviagem;

		/*Informa a quantidade de combustível no tanque*/
		System.out.print("\n\nQuantidade Abastecido: ");
		combustivel = Double.parseDouble(System.console().readLine());

		/*Variável de controle média para veículos com rendimento de consumo 10 km por litro rodado.*/
		/*Deve-se atentar-se caso veículo fizer mas de 10km por litro em alterar também linhas 45, 54, 73, 79, 83, 89 e 98 */
		mediac = combustivel / 10;
	
		/*inicializa as variáveis obrigatório*/	
		distanciapercorrida = 0;
		combustivelrestante = 0;
		distancia = 0;
		totaldeviagem = 0;
		restante = 0;
		consumomedio = 0;
		/*condição para atender a distância percorrida enquanto tiver combustível*/
		while(distanciapercorrida <= combustivel){
			
			/*informa a distância percorrida*/
			System.out.print("Gasolina utilizada: ");
			distancia = Double.parseDouble(System.console().readLine());

			/*total de combustível restante após viajem realizada */
			combustivelrestante = combustivel - distanciapercorrida;
			/*total de viajens realizada*/
			distanciapercorrida = distanciapercorrida + distancia;
			/*total de viajem por quantidade de combustível*/
			totaldeviagem = totaldeviagem + 1;
			
			/*condição que informa se tiver combustível e não saiu do local informar total de viagem, se saiu do local e 
			  ficou parado não contabilizar, se informado 0 não contabilizar e manter viagem efetuada */
			if (combustivel > distancia && distancia == 0){
				totaldeviagem = totaldeviagem - 1;
		
				/*condição que informará o que resta de combustível se distância a percorrer for maior que combustível*/	
				}else if(distanciapercorrida > combustivelrestante && distancia > combustivelrestante){
					restante = distancia - combustivelrestante;
					/*Informa que o veículo faz 10km por litro*/
					kmlitro = distanciapercorrida * 10;
					distanciapercorrida = kmlitro;

					consumomedio = combustivel / mediac;
					
					System.out.printf("\nCombustível consumido %2.2f litros,finish.\n",combustivelrestante);
					System.out.printf("Falta %2.2f litro de combustível para alcançar o destino.\n",restante);
					System.out.printf("Consumo médio com %2.1f litros de gasolina será de %2.3f km por litro.\n",combustivel,consumomedio);
					System.out.printf("Viagens com o tanque: %d\n",totaldeviagem);
					System.out.printf("Distancia total percorrida %2.0f km.\n\n",combustivel * 10);
			
				/*condição em que só será possivel realizar viagem se tiver combustível*/
				}else if (combustivel > distanciapercorrida && distancia < combustivel){
					/*combustível restante após distância percorrida*/
					combustivelrestante = combustivel - distanciapercorrida;
	
					/*informa quantidade de combustível restante*/
					System.out.printf("\n%2.2f litros de combustivel restante.\n",combustivelrestante);
				
				/*informa que a viagem não foi realizada por falta de combustível.*/
				}else if(combustivel <= 0){
					System.out.printf("Veículo não funciona com %2.1f de combustível.\n",combustivel);
					totaldeviagem = 0;
					System.out.printf("total de viagem %d.\n",totaldeviagem);

				/*informa total de viagens realizada com o tanque de combustível*/	
				}else if(distancia >= combustivel && distancia == 0){
					/*Informa que o veíciulo faz 10 km por litro*/
					kmlitro = distanciapercorrida * 10;
					distanciapercorrida = kmlitro;

					consumomedio = combustivel / mediac;
					System.out.printf("\nConsumo médio com %2.1f litros de gasolina será de %2.3f km por litro.\n",combustivel,consumomedio);
					System.out.printf("Total de viagem: %d\n",totaldeviagem);
					System.out.printf("Distância total percorrida %2.0f km.\n\n",combustivel * 10);
				
					}else{	
							/*Informa que o veículo faz 10 km por litro*/
							kmlitro = distanciapercorrida * 10;
							distanciapercorrida = kmlitro;
	
							consumomedio = combustivel / mediac;
							System.out.printf("\nConsumo médio com %2.1f litros de gasolina será de %2.3f km por litro.\n",combustivel,consumomedio);
							System.out.printf("Total de viagem: %d\n",totaldeviagem);
							System.out.printf("Distância total percorrida %2.0f km.\n\n",combustivel * 10);
					}
		}
					System.out.print("|*************************|\n");
					System.out.printf("  Consumido: %2.2f\n",combustivelrestante);
					System.out.printf("  Falta: %2.2f\n",restante);
					System.out.printf("  Média: %2.3f\n",consumomedio);
					System.out.printf("  Viagem: %d\n",totaldeviagem);
					System.out.printf("  Percorrido: %2.2f\n\n",combustivel * 10);
					System.out.print("|*************************|\n");
	}
}
