public class conversionStringToStringBuffer01 {
	public void printHelloJava () {
		// 객체 상태에서는 어떻게 되는지 확인하기 위해 만들어 봄
		String kk = "hello " ;
		String mm = "java" ;
		String nn = new String(kk + mm) ;
		System.out.println(kk + mm);
		System.out.println(nn);
	}
	public static void main(String[] args) {
		(new conversionStringToStringBuffer01()).printHelloJava();
	}
}
/*
 * 참조
 * https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
 * 
 * https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html
 * 
 */
/*
StringBuilder는 단일 스레드 상태에서 사용하는 StringBuffer의 대응 클래스로 JDK 1.5부터 지원하기 시작했다.
그러나 스레드 세이프 하지 않은 입출력 프로그램이나 네트워크 프로그램에서는 StringBuilder가 아닌
StringBuffer가 생성되므로 전반적으로 StringBuilder로 생성되는 것이 아니라 StringBuffer라고 말하는 것뿐이다.
명확히 그리고 엄밀히 말하면 같은 기능을 수행하는 클래스들이지만 생성의 결과는 컴파일러 버전에 따라 완전히 다르다.
완전히 정착된 시기는 JDK 1.7부터 완전하게 정착되었다는 점을 알려둔다.  
 */
/*
이 소스를 JDK 1.8에서 JDK 1.4용으로 출력하게 컴파일 한 다음 javap로 디스어셈블 해보면 다음과 결과가 나온다.
$ javac -target 1.4 -source 1.4 conversionStringToStringBuffer01.java
warning: [options] bootstrap class path not set in conjunction with -source 1.4
warning: [options] source value 1.4 is obsolete and will be removed in a future release
warning: [options] target value 1.4 is obsolete and will be removed in a future release
warning: [options] To suppress warnings about obsolete options, use -Xlint:-options.
4 warnings

$ javap -c conversionStringToStringBuffer01.class
Compiled from "conversionStringToStringBuffer01.java"
public class conversionStringToStringBuffer01 {
  public conversionStringToStringBuffer01();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public void printHelloJava();
    Code:
       0: ldc           #2                  // String hello
       2: astore_1
       3: ldc           #3                  // String java
       5: astore_2
       6: new           #4                  // class java/lang/String
       9: dup
      10: new           #5                  // class java/lang/StringBuffer
      13: dup
      14: invokespecial #6                  // Method java/lang/StringBuffer."<init>":()V
      17: aload_1
      18: invokevirtual #7                  // Method java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
      21: aload_2
      22: invokevirtual #7                  // Method java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
      25: invokevirtual #8                  // Method java/lang/StringBuffer.toString:()Ljava/lang/String;
      28: invokespecial #9                  // Method java/lang/String."<init>":(Ljava/lang/String;)V
      31: astore_3
      32: getstatic     #10                 // Field java/lang/System.out:Ljava/io/PrintStream;
      35: new           #5                  // class java/lang/StringBuffer
      38: dup
      39: invokespecial #6                  // Method java/lang/StringBuffer."<init>":()V
      42: aload_1
      43: invokevirtual #7                  // Method java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
      46: aload_2
      47: invokevirtual #7                  // Method java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
      50: invokevirtual #8                  // Method java/lang/StringBuffer.toString:()Ljava/lang/String;
      53: invokevirtual #11                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      56: getstatic     #10                 // Field java/lang/System.out:Ljava/io/PrintStream;
      59: aload_3
      60: invokevirtual #11                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      63: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #12                 // class conversionStringToStringBuffer01
       3: dup
       4: invokespecial #13                 // Method "<init>":()V
       7: invokevirtual #14                 // Method printHelloJava:()V
      10: return
}

하지만 JDK 1.8에서 컴파일 해서 디스어셈블을 해보면 다음과 같은 결과가 나온다.
$ javac conversionStringToStringBuffer01.java
$ javap -c conversionStringToStringBuffer01.class
Compiled from "conversionStringToStringBuffer01.java"
public class conversionStringToStringBuffer01 {
  public conversionStringToStringBuffer01();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public void printHelloJava();
    Code:
       0: ldc           #15                 // String hello
       2: astore_1
       3: ldc           #17                 // String java
       5: astore_2
       6: new           #19                 // class java/lang/String
       9: dup
      10: new           #21                 // class java/lang/StringBuilder
      13: dup
      14: aload_1
      15: invokestatic  #23                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      18: invokespecial #27                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
      21: aload_2
      22: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      25: invokevirtual #34                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      28: invokespecial #38                 // Method java/lang/String."<init>":(Ljava/lang/String;)V
      31: astore_3
      32: getstatic     #39                 // Field java/lang/System.out:Ljava/io/PrintStream;
      35: new           #21                 // class java/lang/StringBuilder
      38: dup
      39: aload_1
      40: invokestatic  #23                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      43: invokespecial #27                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
      46: aload_2
      47: invokevirtual #30                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      50: invokevirtual #34                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      53: invokevirtual #45                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      56: getstatic     #39                 // Field java/lang/System.out:Ljava/io/PrintStream;
      59: aload_3
      60: invokevirtual #45                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      63: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #1                  // class conversionStringToStringBuffer01
       3: dup
       4: invokespecial #56                 // Method "<init>":()V
       7: invokevirtual #57                 // Method printHelloJava:()V
      10: return
}
 */