package orcgenerator;

import java.util.Random;

public class Orc {
    private int age;
    private String name, clan;
    private Random rand = new Random();
    
    public Orc() {
        age = setAge();
        name = setName();
        clan = setClan();
    }
    
    public Orc(int a) {
        age = a;
        name = setName();
        clan = setClan();
    }
    
    public Orc(int a, String n, String c) {
        age = a;
        name = n;
        clan = c;
    }
    
    public String setName() {
        String[] n = {"Thrall", "Blackhand", "Gul'dan", "Orgrim"};
        return n[rand.nextInt(n.length)];
    }
    
    public String setClan() {
        String[] c = {"Frostwolf clan", "Warsong clan", "Blackrock clan", "Shadowmoon clan"};
        return c[rand.nextInt(c.length)];
    }
    
    public int setAge() {
        int a = rand.nextInt(30) + 25;
        return a;
    }
    
    public void printOut() {
        System.out.println(name + " " + age + " " + clan);
    }
    
}
