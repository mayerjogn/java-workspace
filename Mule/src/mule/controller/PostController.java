package mule.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mule.compare.PostAscending;
import mule.model.Post;

public class PostController {

	ArrayList<Post> postlist = new ArrayList<>();

	public boolean uploadPost(Post post) {// Post 업로드
		return postlist.add(post);
	}

	public Post searchPost(String title) {
		for(Post post : postlist) {
			if(post.getTitle().contains(title)) {
				return post;
			}

		}
		return null;
		
	}

	public ArrayList<Post> descPost() {// Post 오름차순 정렬
		ArrayList<Post> clone = new ArrayList<>(postlist);
		Collections.sort(clone, new PostAscending());
		return clone;

	}
}
