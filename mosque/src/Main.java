public class Main {
    public static void main(String[] args) {

        TowerMosque towerMosque = new TowerMosque();

        Observer quanysh = new Muslim("Quanysh");
        Observer ademi = new Muslim("Ademi");


        towerMosque.registerMuslims(quanysh);
        towerMosque.registerMuslims(ademi);

        System.out.println("----------------------------------------");
        towerMosque.setNewsMosque("Tomorrow will be meeting");
        towerMosque.setNewsMosque("Juma Namaz");
        System.out.println("----------------------------------------");

        towerMosque.removeMuslims(ademi);

        towerMosque.setNewsMosque("Kadir tuni is today, good luck!");
        System.out.println("----------------------------------------");
    }
}
