/*
6.Faça um programa que preencha uma matriz de 3 x 3, calcule e mostre:
Mostre a soma dos elementos que estão na diagonal principal e na diagonal secundaria;
Mostre a soma dos elementos de cada uma das linhas;
Mostre a soma de cada uma das colunas.
 */
package listaMatrizes06;
import java.util.Random;
import java.util.Scanner;

public class listaMatrizes06 {

public static void main(String[] args) {
    
    Random aleatorio = new Random();
    int i, j, soma = 0;
    int mat[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int linha, coluna, somaC = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Digite o numero de linhas da matriz:\n ");
    linha = input.nextInt();
    System.out.print("Digite o numero de colunas da matriz:\n ");
    coluna = input.nextInt();

    System.out.println("Diagonal principal: ");
        for ( linha = 0; linha < mat.length; linha++){
            for(coluna = 0; coluna < mat[linha].length; coluna++){
                if(linha == coluna){
                    soma += mat[linha][coluna];
                    
                    System.out.println(mat[linha][coluna]+" ");
                        somaC = somaC + mat[0][coluna];
                }
            }
            
        }
        System.out.println("A soma da diagonal principal é: "+ soma);

        int[][] m = new int[linha][coluna];
        for ( i = 0; i < m.length; i++) {
            for ( j = 0; j < m[i].length; j++) {
                somaC = somaC + m[0][j];
            }
        }
    int[][] matriz = new int[linha][coluna];
    for ( i = 0; i < matriz.length; i++) {
        for ( j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = aleatorio.nextInt(9);
            System.out.printf("%d ", matriz[i][j]);
            
        }
        System.out.println();
        
    }
    System.out.println("Soma da diagonal secundaria=" + somaDiagonal(matriz));
}
public static int somaDiagonal(int[][] matriz) {
    int soma = 0, somaC=0;
    int coluna = matriz[0].length - 1; // ulltimo elemento da primeira linha
    for (int linha = 0; linha < matriz.length; linha++) {
        soma += matriz[linha][coluna];
        coluna--;
        if (coluna < 0) // acabaram as colunas, interrompe o for
            break;
            somaC += coluna + matriz[0][coluna];
                System.out.println("colunas: "+ somaC);
    }
    return soma;
}
}
