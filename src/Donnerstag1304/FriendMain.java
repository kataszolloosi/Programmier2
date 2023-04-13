package Donnerstag1304;

import java.util.ArrayList;

public class FriendMain {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Peter", 30, "Graz", "Austria", 2014);
        Friend friend2 = new Friend("Nora", 34, "Nagykanizsa", "Ungarn", 2023);
        Friend friend3 = new Friend("Ramona", 31, "Budapest", "Ungarn", 2005);


        FriendList fl1 = new FriendList();
        fl1.addFriend(friend1);
        fl1.addFriend(friend2);
        fl1.addFriend(friend3);

        fl1.print();

        System.out.println("------------------");
        ArrayList<Friend> from = fl1.friendsFrom("Graz");
//        for (Friend f: from) {
//            System.out.println(f);
//        }
        fl1.print(from);

        System.out.println(fl1.oldestFriend());

    }
}
