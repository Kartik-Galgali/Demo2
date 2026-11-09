package javapgm;

public class StrBufferPgm {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Navin");
		System.out.println(sb.capacity());
		sb.append(" Reddy");
//		sb.deleteCharAt(2);
//		String str = sb.toString();
//		sb.insert(0, "Java ");
//		sb.ensureCapacity(100);
//		sb.setLength(30);
		System.out.println(sb);
	}
}
