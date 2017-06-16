public class conversionStringToStringBuffer01 {
	public void printHelloJava () {
		// ��ü ���¿����� ��� �Ǵ��� Ȯ���ϱ� ���� ����� ��
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
 * ����
 * https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
 * 
 * https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html
 * 
 */
/*
StringBuilder�� ���� ������ ���¿��� ����ϴ� StringBuffer�� ���� Ŭ������ JDK 1.5���� �����ϱ� �����ߴ�.
�׷��� ������ ������ ���� ���� ����� ���α׷��̳� ��Ʈ��ũ ���α׷������� StringBuilder�� �ƴ�
StringBuffer�� �����ǹǷ� ���������� StringBuilder�� �����Ǵ� ���� �ƴ϶� StringBuffer��� ���ϴ� �ͻ��̴�.
��Ȯ�� �׸��� ������ ���ϸ� ���� ����� �����ϴ� Ŭ������������ ������ ����� �����Ϸ� ������ ���� ������ �ٸ���.
������ ������ �ñ�� JDK 1.7���� �����ϰ� �����Ǿ��ٴ� ���� �˷��д�.  
 */
/*
�� �ҽ��� JDK 1.8���� JDK 1.4������ ����ϰ� ������ �� ���� javap�� �𽺾���� �غ��� ������ ����� ���´�.
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

������ JDK 1.8���� ������ �ؼ� �𽺾������ �غ��� ������ ���� ����� ���´�.
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