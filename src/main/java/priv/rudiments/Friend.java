package priv.rudiments;

import java.util.ArrayList;
import java.util.Collection;

public class Friend {
	private Collection<Friend> friends;
	private String email;

	public Friend(String email) {
		this.email = email;
		this.friends = new ArrayList<Friend>();
	}

	public String getEmail() {
		return email;
	}

	public Collection<Friend> getFriends() {
		return friends;
	}

	public void addFriendship(Friend friend) {
		friends.add(friend);
		friend.getFriends().add(this);
	}

	public boolean canBeConnected(Friend friend) {
		Collection<Friend> seen = new ArrayList<Friend>();
		return canBeConnected(friend, seen);
	}

	public boolean canBeConnected(Friend friend, Collection<Friend> seen) {
		if (friend.getEmail().equals(this.email)) {
			return true;
		}
		seen.add(this);
		for (Friend myFriend : friends) {
			if (!seen.contains(myFriend)) {
				return myFriend.canBeConnected(friend, seen);
			}
		}
		return false;
	}

	public String toString() {
		return this.email;
	}

	public static void main(String[] args) {
		Friend a = new Friend("A");
		Friend b = new Friend("B");
		Friend c = new Friend("C");
		Friend d = new Friend("D");
		

		a.addFriendship(b);
		b.addFriendship(c);
		c.addFriendship(d);

		System.out.println(a.canBeConnected(d));
	}
}
