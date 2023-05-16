package Asem4.h4;

public class Main {
    public static void main(String[] args) {
        ExecService executorService = new ExecService(2);
        executorService.execute(() ->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService.submit(() -> System.out.println("Start"));
        executorService.shutdown();
    }
    }

