package ex_01;

public class ex_01 {
    public static void main(String[] args) {
        canhao cn = new canhao();
        Bala bala = new Bala();

        cn.setBala(bala);
        cn.setBala(0, 0);
        cn.disparar(10, 50);
        System.out.println("A posicao final da bala e: " + cn.getAlacanceMaximo());
        cn.setBala(1, 1);
        cn.disparar(10, 50);
        System.out.println("A posicao final da bala e: " + cn.getAlacanceMaximo());
        cn.setBala(5, 3);
        cn.disparar(10, 50);
        System.out.println("A posicao final da bala e: " + cn.getAlacanceMaximo());
        
        
    }
}
