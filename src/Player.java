public class Player {
    private String name;
    private int healthPercantage;
    private Weapon weapon;

    public Player(String name, int healthPercantage, Weapon weapon) {
        this.name = name;
        if(healthPercantage > 100){
            this.healthPercantage = 100;
        }else if(healthPercantage < 0){
            this.healthPercantage = 0;
        }else{
            this.healthPercantage = healthPercantage;
        }
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercantage;
    }

    public void loseHealth(int damage){
        if(healthPercantage - damage < 0){
            System.out.println(name + " player has been knocked out of game");
        }
        healthPercantage = Math.max(healthPercantage - damage, 0);
    }

    public void restoreHealth(int healthPotion){
        healthPercantage = Math.min(healthPercantage + healthPotion, 100);
    }
}
