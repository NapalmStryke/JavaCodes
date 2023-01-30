public class Ship {
    private String shipName;
    private int hullHP;
    private int shieldHP;
    private String armament;

    // SHIP NAME getters and setters
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    // HUll HP getters and setters
    public int getHullHP() {
        return hullHP;
    }

    public void setHullHP(int hullHP) {
        this.hullHP = hullHP;
    }

    // SHIELD HP getters and setters
    public int getShieldHP() {
        return shieldHP;
    }

    public void setShieldHP(int shieldHP) {
        this.shieldHP = shieldHP;
    }

    // ARMAMENT getters and setters
    public String getArmament() {
        return armament;
    }

    public void setArmament(String armament) {
        this.armament = armament;
    }

    public Ship(String shipName, int hullHP, int shieldHP, String armament) {
        this.shipName = shipName;
        this.hullHP = hullHP;
        this.shieldHP = shieldHP;
        this.armament = armament;

    }

    @Override
    public String toString() {
        return "Ship Name --> " + shipName + "\nHull HP --> " + hullHP + "\nShield HP --> " + shieldHP
                + "\nArmament --> "
                + armament;
    }

    public static void main(String[] args) {
        Ship myShip1 = new Ship("Mongo G Floyd 7000", 100, 100, "Torpedo");
        System.out.println(myShip1);
    }
}
