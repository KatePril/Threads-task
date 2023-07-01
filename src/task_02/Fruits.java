package task_02;

class Fruits extends Thread {

    public void run() {
        for (String fruit : getFruits()) {
            System.out.println(fruit);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println("Exception" + ie);
            }
        }
    }

    private String[] getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
