package charactor;

public class Hero2 {
    public String name;
    public float hp;
    public int damage;
    public int id;

    public Hero2() {
    }

    public Hero2(String string) {
        name = string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero2{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean isDead() {
        // TODO Auto-generated method stub
        return false;
    }
    public void attackHero(Hero2 h2) {
        System.out.println(this.name+ " 正在攻击 " + h2.getName());
    }

}
