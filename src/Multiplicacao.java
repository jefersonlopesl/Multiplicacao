public class Multiplicacao {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[1]);
        int y=Integer.parseInt(args[2]);

        if (args[0].equals("multiplicar")){
            mul(x,y);
        } else {
            System.out.println("Comando nao reconhecido");
        }
    }

    static void mul(int x,int y){
        System.out.println(x*y);
    }
}
