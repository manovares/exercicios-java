package Treinos;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("França","Pretty Boy",31, 68.9f,1.75f,11,2,1);
        l[1] = new Lutador("Brasil","Putssript",29,57.8f,1.68f,14,2,3);
        l[2] = new Lutador("EUA","SnapShadow",35,80.f,1.65f,12,2,1);
        l[3] = new Lutador("Australia", "Dead Code", 28,81.6f,1.93f,13,0,2);
        l[4] = new Lutador("Brasil","UF0Cobol",37,119.7f,1.70f,5,4,3);
        l[5] = new Lutador("EUA", "Nerdaart", 30, 105.7f,1.81f,12,2,4);


        Luta uec01 = new Luta();
        uec01.marcaLuta(l[0],l[1]);
        uec01.lutar();
        l[0].status();
        l[1].status();

    }
}
