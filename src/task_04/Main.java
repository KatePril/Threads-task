package task_04;

public class Main {

    public static void main(String[] args) {

        Fruits fruits = new Fruits();
        fruits.start();
        fruits.interrupt();

        showVeges(getVeges());
    }

    private static String[] getVeges() {
        return new String[]{"tomato", "cucumber", "carrot"};
    }

    private static void showVeges(String[] veges) {
        for (String veg : veges) System.out.println(veg);
    }
}
