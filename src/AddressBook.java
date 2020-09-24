import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressBook;

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

    void addBuddy(BuddyInfo buddy) {
        this.addressBook.add(buddy);
    }

    void removeBuddy(BuddyInfo buddy) {
        this.addressBook.remove(buddy);
    }
}
