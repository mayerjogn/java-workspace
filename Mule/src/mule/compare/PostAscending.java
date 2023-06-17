package mule.compare;

import java.util.Comparator;

import mule.model.Post;

public class PostAscending implements Comparator <Post> {

	@Override
	public int compare(Post o1, Post o2) {
		if(o1 == null) {
			return 0;
		}else if(o1==null) {
			return -1;
		}else if(o2==null) {
			return 1;
		}
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
