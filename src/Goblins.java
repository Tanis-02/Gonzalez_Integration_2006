// ELizabeth Gonzalez

public class Goblins {
  private int numOfHorde;
  private int health;
  private int attack;
  
  public void setNumOfHorde(int horde) {
    numOfHorde = horde;
  }
  
  public void setHealth(int hitPoints) {
    health = hitPoints;
  }
  
  public void setAttack(int damage) {
    attack = damage;
  }
  
  public int getNumOfHorde() {
    return numOfHorde;
  }
  
  public int getHealth() {
    return health;
  }
  
  public int getAttack() {
    return attack;
  }
  
  public Goblins(int horde, int hitPoints, int damage) {
    numOfHorde= horde;
    health = hitPoints;
    attack = damage;
  }
}
