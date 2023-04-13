package Donnerstag1304;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FriendList {
    private ArrayList<Friend> friends = new ArrayList<>();

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    public void addFriend(Friend f) {
        friends.add(f);
    }

    public void print(){
        System.out.println("--------for:each als methode-----");
        friends.forEach((f) -> System.out.println(f));
        System.out.println();
       /* System.out.println("-------for:each--------");
        for (Friend f:friends) {
            System.out.println(f);
        }
        System.out.println();
        System.out.println("------for schleife--------");
        //size() anstatt length()
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));

        }*/
    }

    public void print(ArrayList<Friend> friends) {
        for (Friend f : friends) {
            System.out.println(f);
        }
        System.out.println();
    }

    public ArrayList<Friend> friendsFrom(String city) {
        ArrayList<Friend> result = new ArrayList<>();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCity().equals(city)) {
                result.add(friends.get(i));
            }

        }
        return result;
    }
    public Friend oldestFriend() {
        int year = Year.now().getValue();
        Friend oldestFriend = friends.get(0);
        int howlong = year -friends.get(0).getKnownSince();

        for (int i = 0; i < friends.size(); i++) {
            if ((year- friends.get(i).getKnownSince() > howlong)){
                howlong = year- friends.get(i).getKnownSince();
                oldestFriend = friends.get(i);
            }
        } return oldestFriend;
    }
}
