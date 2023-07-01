package task_04;

class Fruits extends Thread{

    public void run() {
        for (String fruit : getFruits()) {
            System.out.println(fruit);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted");
        }
    }

    private String[] getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
