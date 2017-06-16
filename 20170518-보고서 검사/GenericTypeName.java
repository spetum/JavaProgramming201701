
public class GenericTypeName<T> {
	public String getTypeName(T a) {
		return a.getClass().getName() ;
	}
	public static void main(String[] args) {
		System.out.println(new GenericTypeName<>().getTypeName(3.0f));
	}
}
