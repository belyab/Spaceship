package tic_tac_toe;

public class Spaceship {
	private String name;
	private int durability;
	private int damage;

    public String getName(){
        return this.name;
    }

	public Spaceship(String shipName,int shipDamage){
	    this.name = shipName;
	    this.damage = shipDamage;
	    this.durability = 20;
        }
    public Spaceship(){

        }

    @Override
    public String toString() {
        return "Spaceship{" +
                "name='" + name + '\'' +
                ", durability=" + durability +
                ", damage=" + damage +
                '}';
    }

    public void takeDmg(int dmg){
	    System.out.println("Spaceship "+this.name+" recieved "+dmg+" damage");
	    this.durability -= dmg;
    }

}
