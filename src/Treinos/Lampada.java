package Treinos;

public class Lampada {
    private boolean ligado = false;


    public Lampada() {
        ligado = false;
        System.out.println("Uma nova lampada foi criada!");
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void visualizar() {
        if(ligado == true) {
            System.out.println("a lampada esta Ligada!");
        }else  {
            System.out.println("a lampada esta Desligada!");
        }
    }

    public static void main(String[] args) {
        Lampada l = new Lampada();
        l.desligar();
        l.visualizar();

        Lampada l2 = new Lampada();
        l2.ligar();
        l2.visualizar();

    }

}
