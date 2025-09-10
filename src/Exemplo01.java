import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // tres linhas e tres colunas
        int [] [] m= new int[3][2];


        // ler os dados da matriz
        // contador de coluna
        // nesse caso o m.length deu certo pq tem o mesmo numero de linhas e colunas. Essa função pega o numero de linhas
        // e nao a de colunas
        //m[i].lenth para pegar as colunas das linhas
        for (int i=0;i< m.length;i++){
            //contador de linhas
            for (int j=0; j<m[i].length; j++){
                System.out.print("Valor -->");
                //valor da linha i e coluna j
                m[i][j]=sc.nextInt();
            }
        }


        //imprimir os dados da matriz
        for (int i =0;i<m.length;i++){
            for (int j=0; j<m[i].length;j++){
                // sem o print ln para ue fique impresso em linha e nao um embaixo do outro
                System.out.print(m[i][j]+"\t");
            }
            // print ln para mudar de linha
            System.out.println();
        }
    }
}
