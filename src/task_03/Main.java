package task_03;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Thread group");
        getFruits(group);
        getVeges(group);
        getBerries(group);
    }

    private static void getFruits(ThreadGroup group) {
        Fruits fruits = new Fruits(group, "\nFruits:");
        fruits.start();
        try {
            fruits.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getVeges(ThreadGroup group) throws InterruptedException {
        Veges veges = new Veges(group, "\nVeges:");
        veges.start();
        try {
            veges.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }/* чекає, поки цей потік помре, і приєднує інший потік **/
    }

    private static void getBerries(ThreadGroup group) throws InterruptedException {
        Berries berries = new Berries(group, "\nBerries:");
        berries.start();
        try {
            berries.join();/* чекає, поки цей потік помре, і приєднує інший потік **/
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
