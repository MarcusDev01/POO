package exercicio04;

public class Teste {
    public static void main(String[] args) {
        System.out.println(somar (2,1));
        System.out.println(somar (2,1,4));
        System.out.println(somar (2,1,4,6,2));
    }


    public static int  somar (int ...x){
        int soma=0;

        //outro tipo de for
        for(int i : x){
            soma += i;
        }
        return soma;
    }
}
