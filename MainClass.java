public class MainClass {
    public static void main (String args[]){
    Hero hero = new Hero();
    hero.move();
    hero.move("samping");
    Enemy enemy = new Enemy();
    enemy.move();
    enemy.move(3);
    System.out.println();

    Character ch = new Enemy();
    ch.move();
    ch = new Hero();
    ch.move();
    ch = new Witch();
    ch.move();
    ch = new Fighter();
    ch.move();
    System.out.println();

    Character chr = new Character();
    chr = new Witch();
    Witch w = (Witch) chr;
    w.move();
    chr = new Fighter();
    Fighter f = (Fighter) chr;
    f.move();
    }
}
