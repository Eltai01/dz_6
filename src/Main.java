public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss ();
        boss.setHealths(500);
        boss.setDamage(70);
        boss.weapon.setNameWeapon("EDGED_WEAPONS");
        System.out.println(" Boss Healths: " + boss.getHealths() + " Boss damage: " + boss.getDamage() +
                " Weapon: " + boss.weapon.getNameWeapon() + " Weapon Type: " + WeaponType.EDGED_WEAPONS );
    }
}