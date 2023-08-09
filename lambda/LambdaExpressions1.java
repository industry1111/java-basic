package lambda;

public class LambdaExpressions1 {

    public static void main(String[] args) {
        //기존 인터페이스 구현 방식
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드1 실행");
            }
        };

        runnable.run();

        //람다식 사용
        Runnable runnable2 = (() -> {
            System.out.println("스레드2 실행");
        });

        runnable2.run();
    }
}
