class TestMyThread {
    public static void main(String[] arg) throws Throwable {
        int n = 7;
        MyThread2 mt = new MyThread2();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Calling System.gc()");
        mt = new MyThread2();
        System.out.println("1");
        System.gc();
        System.out.println("2");
        System.runFinalization();
        System.out.println("3");
    }
}
