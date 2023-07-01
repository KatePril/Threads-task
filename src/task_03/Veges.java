package task_03;

class Veges extends Thread {

    public Veges(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (String veg : getVeges()) {
            System.out.println(veg);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    private String[] getVeges() {
        return new String[]{"tomato", "cucumber", "carrot"};
    }
}
