import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressBook;

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Jack", "Canada", "555");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(buddyInfo);
    }

    void addBuddy(BuddyInfo buddy) {
        this.addressBook.add(buddy);
    }

    void removeBuddy(BuddyInfo buddy) {
        this.addressBook.remove(buddy);
    }
}
