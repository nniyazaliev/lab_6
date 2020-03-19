class Thread2 extends Thread {

    public Thread2() {
        System.out.println("Привет!");
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Пока!");
    }
}