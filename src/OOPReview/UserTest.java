package OOPReview;

public class UserTest {
    public static void main(String[] args) {
        User brance = new User("javamancer", "brance@codeup.com", "abc123");
        User jasmine = new User("mirafawn", "jasmine@gmail.com", "def456");

        brance.addFriend(jasmine);

        for(User friend : brance.getFriends()) {
            System.out.println("friend.getUsername() = " + friend.getUsername());
        }
        for(User friend : jasmine.getFriends()) {
            System.out.println("friend.getUsername() = " + friend.getUsername());
        }

    }
}
