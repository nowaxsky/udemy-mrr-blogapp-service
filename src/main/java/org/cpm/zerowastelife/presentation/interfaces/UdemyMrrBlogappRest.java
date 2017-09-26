package org.cpm.zerowastelife.presentation.interfaces;

import java.util.List;

import org.cpm.zerowastelife.commons.response.JsonResponse;
import org.cpm.zerowastelife.entity.Post;
import org.cpm.zerowastelife.exception.UmbsBaseException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface UdemyMrrBlogappRest {
	
	/**
	 * find all posts in database
	 * @return
	 * @throws UmbsBaseException
	 */
	@RequestMapping(value="/api/posts", method=RequestMethod.GET)
	public JsonResponse<List<Post>> findAllPosts() throws UmbsBaseException;
	
	/**
	 * find post by id
	 * @param id
	 * @return
	 * @throws UmbsBaseException
	 */
	@RequestMapping(value="/api/post", method=RequestMethod.GET)
	public JsonResponse<Post> findPostById(@RequestParam(value="id") int id) throws UmbsBaseException;

	/**
	 * add post into database
	 * @param post
	 * @return
	 * @throws UmbsBaseException
	 */
	@RequestMapping(value="/api/post", method=RequestMethod.PUT)
	public JsonResponse<Boolean> addPost(@RequestBody Post post) throws UmbsBaseException;
	
	/**
	 * delete post from database
	 * @param id
	 * @return
	 * @throws UmbsBaseException
	 */
	@RequestMapping(value="/api/post/{id}", method=RequestMethod.DELETE)
	public JsonResponse<Boolean> deletePost(@RequestParam(value="id") int id) throws UmbsBaseException;
	
}
