// Elizabeth Gonzalez

public class Party {
  private int healthPoints;
  private int attackPoints;
  
  public void setHealthPoints(int hp) {
    healthPoints = hp;
  }
  
  public void setAttackPoints(int attack) {
    attackPoints = attack;
  }
  
  public int getHealthPoints() {
    return healthPoints;
  }
  
  public int getAttackPoints() {
    return attackPoints;
  }
  
  public Party(){
    System.out.println("Example of a constructor with no parameters.");
  }
}
