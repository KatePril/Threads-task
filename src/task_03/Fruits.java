package task_03;

class Fruits extends Thread{

    public Fruits(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (String fruit : getFruits()) {
            System.out.println(fruit);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    private String[] getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
