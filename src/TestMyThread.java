class TestMyThread {
    public static void main(String[] arg) throws Throwable {
        int n = 7;
        Thread2 th = new Thread2();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Calling System.gc()");
        th = new Thread2();
        System.out.println("имя1");
        System.gc();
        System.out.println("имя2");
        System.runFinalization();
        System.out.println("имя3");
        System.out.println("имя4");
        System.out.println("имя5");
    }
}
