public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        Boss boss = new Boss("Evil Boss", 1000, 50, bossWeapon);
        System.out.println("Boss name: " + boss.getName());
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss weapon type: " + boss.getWeapon().getType());
        System.out.println("Boss weapon name: " + boss.getWeapon().getName());
    }
}