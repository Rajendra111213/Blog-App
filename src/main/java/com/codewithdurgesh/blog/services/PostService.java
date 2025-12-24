package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.payloads.PostDto;

public interface PostService {
	
	//create
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	
	Post updatePost(PostDto postDto, Integer postId);
	
	//delete
	
	void deletePost(Integer postId);
	
	//getAllPosts
	
	List<PostDto> getAllPost();
	
	// getSinglePost
	
	PostDto getPostById(Integer postId);
	
	//getAllPostsByCategory
	
	List<PostDto>getPostByCategory(Integer categoryId);
	
	//getAllPostsByUser
	
	List<PostDto> getPostsByUser(Integer userId);
	
	//serach posts
	
	List<Post> searchPosts(String keyword);
	

}
