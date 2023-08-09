## Lambda Expressions 란?
람다식은 자바 8에서 도입된 기존의 불필요한 코드를 줄여주고, 작성된 코드의 가독성을 높여주는 기술로, **익명함수**를 사용하여 함수를 변수처럼 다루는 것을 말한다.

> **익명함수**
> 
> 주로 함수형 프로그래밍에서 사용되며, 함수의 이름을 명시적으로 정의하지 않고 간단한 기능을 표현하거나 다른 함수의 인자로 전달하는데 사용하는 함수

> **함수형 프로그래밍**
>
> 함수형 프로그래밍은 순수함수를 구현하고 호출함으로써 외부자료에 부수적인 영향을 주지 않도록 구현하는 방식을 말하며, 순수 함수란 
> 매개변수만을 사용하여 만드는 함수이다. 즉 함수 내부에서 함수 외부에 있는 변수를 사용하지 않아 함수가 수행되더라도 외부에 영향을 주지 않는 특징을 가진다.

기본 문법

> (parameter) -> expression

여기서 `parameter`는 메서드의 매개변수를 나타내고, `expression`은 메서드의 본문을 표현

```java
public class lambdaExpressions {

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
```


### 특징 
- 메서드 이름과 반환 타입의 경우에는 생략 가능하다.
- 매개변수의 타입을 추론할 수 있는 경우 타입을 생략할 수 있다.(대부분 생략가능)
- 매개변수가 하나인 경우에는 괄호(())를 생략할 수 있다. 
    > str -> {System.out.println(str)};

    - 두개 이상인 경우 사용불가
    > x,y -> {System.out.println(x+y)}; 
- 함수의 몸체가 하나의 명령문만으로 이루어진 경우에는 중괄호({})를 생략할 수 있다. (return문은 사용 불가능)
    > str -> System.out.println(str);
- 구현문이 한문장이더라도 return문은 생략 불가능
    > str -> return str.length();
- 구현문이 return문 하나라면 중괄호와 return문 모두 생략하고 식만 작성
    > str -> str.length();