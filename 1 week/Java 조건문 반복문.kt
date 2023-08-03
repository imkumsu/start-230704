class HelloWorld {
    public static void main(String[] args) {
        int num = ; // 숫자를 입력해야 합니다.
        if (num > 0) {
            System.out.println("positive number");
        } else if (num < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("zero");
        }
    }
}
class HelloWorld {
    public static void main(String[] args) {
        int age = 26;
        if (age >= 19) {
            System.out.println("adult");
        } else {
            System.out.println("minor");
        }
    }
}
//0부터 1씩 증가하는 100개의 숫자를 출력
//100부터 1씩 감소하는 100개의 숫자를 출력력
class HelloWorld {
    public static void main(String[] args) {
        for(int i = 0;i >100;,i++;)
                    System.out.println(i)
        if i>100;
        break
    }
}
//369게임 1부터 100까지 결과물 출력
//한글 프로그래밍과 비교해보기
class HelloWorld {
    public static void main(String[] args) {
        int i = 1;
        while(i < 101) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                System.out.println("clap");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  class HelloWorld {
    public static void main(String[] args) {
        int i = 1;
        while(i < 101) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.println("clap");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}

클래스 (Class):

클래스는 객체를 생성하기 위한 일종의 틀 또는 설계도입니다. 클래스는 객체의 상태와 동작을 정의하는 멤버 변수와 메소드로 구성됩니다. 멤버 변수는 클래스가 가지는 속성이나 상태를 나타내고, 메소드는 클래스가 수행할 수 있는 동작을 정의합니다. 클래스는 객체를 생성하기 위한 템플릿 역할을 하며, 객체들이 공통적으로 가지는 속성과 동작을 정의하여 코드의 재사용성과 구조화를 도와줍니다.

예를 들어, "자동차" 클래스는 자동차의 속성인 색상, 모델, 속도 등을 멤버 변수로 정의하고, 주행, 가속, 감속 등의 동작을 메소드로 정의할 수 있습니다. 클래스를 기반으로 하여 객체를 생성하면, 그 객체는 클래스에서 정의한 속성과 동작을 가지게 됩니다.

메소드 (Method):

메소드는 클래스 또는 객체가 수행하는 작업이나 동작을 나타내는 코드의 블록입니다. 메소드는 입력을 받아서 처리하고, 필요한 경우 결과를 반환할 수도 있습니다. 객체 지향 프로그래밍에서는 메소드가 클래스 또는 객체의 동작을 정의하며, 클래스의 인스턴스에 대해 호출하여 실행할 수 있습니다.

메소드는 특정한 기능을 수행하기 위해 사용되며, 코드의 재사용성과 모듈화를 촉진합니다. 메소드는 매개 변수(parameter)를 통해 입력을 전달받고, 필요한 경우 반환값을 통해 결과를 반환합니다.

예를 들어, "자동차" 클래스의 메소드로 "주행"이라는 동작을 정의할 수 있습니다. 이 메소드는 주행 거리를 입력받아 일정한 동작을 수행하고, 필요한 경우 결과값을 반환할 수 있습니다. 메소드를 호출하여 "주행" 동작을 실행하면, 해당 동작이 수행됩니다.
