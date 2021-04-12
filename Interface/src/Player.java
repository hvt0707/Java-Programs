import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable{
    private String name;
    private String weapon;
    private int health;

    public Player(String name){
        this.name = name;
        this.health = 100;
        this.weapon = "Sword";
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", health=" + health +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public List<String> write() {
        List<String> item = new ArrayList<>();
        item.add(0,name);
        item.add(1,""+health);
        item.add(2,weapon);
        return item;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null){
            name = savedValues.get(0);
            health = Integer.parseInt(savedValues.get(1));
            weapon = savedValues.get(2);
        }
    }
}
