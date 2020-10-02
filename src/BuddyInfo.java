public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Buddy", "123 Main Street", "6135551234");

        System.out.println("Hello " + buddyInfo.getName());
    }

    public String getName() {
        return name;
    }
}
