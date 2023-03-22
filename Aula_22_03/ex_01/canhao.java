package ex_01;

public class canhao {


    private Bala bala;
    private double posicaoFinalBala;

    void disparar(double velocidade, double angulo) {
        this.posicaoFinalBala = velocidade * velocidade
                * (Math.sin(2 * (Math.toRadians(angulo)) / 9.81));
    }

    double getAlacanceMaximo() {
        return this.posicaoFinalBala + this.bala.getPosicaoX();
    }

    void setBala(double X, double Y) {
        this.bala.setPosicaoX(X);
        this.bala.setPosicaoY(Y);
    }

    Bala getBala() {
        return bala;
    }

    void setBala(Bala Bala){
        this.bala = Bala;
    }
}
    

