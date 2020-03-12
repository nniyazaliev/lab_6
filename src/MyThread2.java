class MyThread2 extends Thread {

    public MyThread2() {
        System.out.println("Hi!");
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //System.gc();

//        System.out.println("Calling System.runFinalization()");
//        Thread.sleep(2000);
//        System.runFinalization();
    }

    protected void finalize() throws Throwable {
        System.out.println("Bye!");
    }
}