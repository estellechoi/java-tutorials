# java-tutorials
## Exception (예외)

* 예외(exception) 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류
* 예외 처리를 통해 오류 시에도 프로그램이 종료되지 않고 실행을 계속 하도록 함

 - 일반 예외 (컴파일 오류 발생)
 - 실행 예외 (runtime exception, 컴파일이 되는 예외)

if()

try(a) catch(b) : a 에러 → b 실행

* 예외 클래스

* 최상위 클래스
java.lang.Exception /

* 일반 예외
java.lang.ClassNotFoundException
java.lang.InterruptedException

* 실행 예외
java.lang.RuntimeException /
java.lang.NullPointerException
java.lang.NumberFormatException

* 예외처리 방법

try {

} catch(Exception e) {

} catch(Exception e) {

} catch(Exception e) {

}

 → 발생한 예외에 맞는 catch statement 만 실행됨
