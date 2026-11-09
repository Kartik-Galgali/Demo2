package pkg1;

public class Instagram {

	String username;
	long followers;
	long following;

	public Instagram(String username, long followers, long following) {
		this.username = username;
		this.followers = followers;
		this.following = following;
	}

	@Override
	public String toString() {
		return "Username= " + username + ", Followers= " + followers + ", Following= " + following;
	}

	public static void main(String[] args) {
		Instagram i1 = new Instagram("CarryMinati", 10000000, 10);
		System.out.println(i1);
		Instagram i2 = new Instagram("AshishChanchalani", 3000000, 16);
		System.out.println(i2);
		System.out.println(i1.equals(i2));
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Instagram) {
			Instagram i = (Instagram) o;
			return this.username.equals(i.username) && this.followers == i.followers && this.following == i.following;
		}
		return false;
	}

}
