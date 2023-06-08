package mule.controller;

import java.util.ArrayList;
import java.util.Collections;

import mule.compare.PostAscending;
import mule.model.Post;

public class PostController {

	ArrayList<Post> postlist = new ArrayList<>();
	
	public void uploadPost(Post post) {//Post 업로드
		postlist.add(post);
	}

	public void updatePost(int index,Post post) {//Post 수정
		postlist.set(index,post);
	}

	public boolean deletePost(Post post) {//Post 삭제
		return postlist.remove(post);
	}

	public Post viewPost(int index,Post post) {// Post 1개 보기
		return postlist.set(index, post);
	}
	public Post searchPost(String title) {// Post 찾기
		for(Post post : postlist)
			if(post.getTitle().contains(title)) {
				return post;
			}
		return null;
	}

	public ArrayList<Post> descPost(){// Post 오름차순 정렬
		ArrayList<Post> list =(ArrayList<Post>)this.postlist.clone();//배열 복사  맞냐이거
		Collections.sort(list, new PostAscending());
		return list;
		
	}
}
