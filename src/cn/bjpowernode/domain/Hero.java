package cn.bjpowernode.domain;

public class Hero {
    private String id;
    private String name;
    private int attack;
    private String birthplace;

    public Hero() {
    }

    public Hero(String id, String name, int attack, String birthplace) {
        this.id = id;
        this.name = name;
        this.attack = attack;
        this.birthplace = birthplace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", birthplace='" + birthplace + '\'' +
                '}';
    }
}

