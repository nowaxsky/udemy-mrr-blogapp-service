package org.cpm.zerowastelife.service;

import java.util.List;

import org.cpm.zerowastelife.entity.Post;
import org.cpm.zerowastelife.exception.UmbsBaseException;

public interface UdemyMrrBlogappService {

	/**
	 * find all posts in database
	 * @return
	 * @throws UmbsBaseException
	 */
	public List<Post> findAllPosts() throws UmbsBaseException;
	
	/**
	 * find post by id
	 * @param id
	 * @return
	 * @throws UmbsBaseException
	 */
	public Post findPostById(int id) throws UmbsBaseException;
	
	/**
	 * add post into database
	 * @param post
	 * @return
	 * @throws UmbsBaseException
	 */
	public Boolean addPost(Post post) throws UmbsBaseException;
	
	/**
	 * delete post from database
	 * @param id
	 * @return
	 * @throws UmbsBaseException
	 */
	public Boolean deletePost(int id) throws UmbsBaseException;
}
