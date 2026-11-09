package javapgm;

enum Status {
	Running, Failed, Pending, Success;
}

public class EnumPgm {
	public static void main(String[] args) {
		 Status s = Status.Pending;

		switch (s) {
		case Running:
			System.out.println("All Good 👍");
			break;
		case Failed:
			System.out.println("Try Again ❌");
			break;
		case Pending:
			System.out.println("Please Wait ⏳");
			break;
		default:
			System.out.println("Done ✅");
			break;
		}
		 
		/* if (s == Status.Running) {
			System.out.println("All Good 👍");
		}
		 else if (s == Status.Failed) {
			System.out.println("Try Again ❌");
		}
		 else if (s == Status.Pending) {
			System.out.println("Please Wait ⏳");
		}
		 else {
			 System.out.println("Done ✅");
		 } */
		 
		/* System.out.println(s);
		 System.out.println(s.ordinal());
		
		 Status[] ss = Status.values();
		 System.out.println(ss);
		 for (Status s : ss) {
		 System.out.println(s);
		 } */
	}
}
