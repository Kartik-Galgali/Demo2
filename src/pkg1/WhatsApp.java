package pkg1;

public class WhatsApp {

    String username;
    long phoneNumber;
    int totalMessages;

    public WhatsApp(String username, long phoneNumber, int totalMessages) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.totalMessages = totalMessages;
    }

    @Override
    public String toString() {
        return "Username= " + username + ", Phone Number= " + phoneNumber + ", Total Messages= " + totalMessages;
    }

    public static void main(String[] args) {

        WhatsApp w1 = new WhatsApp("Kartik", 9876543210L, 500);
        WhatsApp w2 = new WhatsApp("Rahul", 9876543211L, 300);

        System.out.println(w1);
        System.out.println(w2);

        System.out.println(w1.equals(w2));
    }
    
    @Override
    public boolean equals(Object o) {

        if (o instanceof WhatsApp) {

            WhatsApp w = (WhatsApp) o;

            return this.username.equals(w.username) && this.phoneNumber == w.phoneNumber && this.totalMessages == w.totalMessages;
        }

        return false;
    }
}