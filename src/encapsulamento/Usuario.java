package encapsulamento;

public class Usuario {
    public static void main(String[] args) {
        Tv tv = new Tv();

        //o usuário não precisa saber as operações que a Tv  realiza para ligar
        tv.ligarTv();
    }
}
