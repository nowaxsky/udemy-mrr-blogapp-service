package org.cpm.zerowastelife.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.cpm.zerowastelife.commons.contraints.UmbsBaseErrorCode;
import org.cpm.zerowastelife.entity.Post;
import org.cpm.zerowastelife.exception.UmbsBaseException;
import org.cpm.zerowastelife.persistance.PostRepository;
import org.cpm.zerowastelife.service.UdemyMrrBlogappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UdemyMrrBlogappServiceImpl implements UdemyMrrBlogappService {

	private final Logger logger = Logger.getLogger(UdemyMrrBlogappServiceImpl.class);
	private PostRepository repository;
	
	@Autowired
	public void setRepository(PostRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Post> findAllPosts() throws UmbsBaseException {
		List<Post> posts = new ArrayList<Post>();
		try {
			repository.findAll().forEach(posts::add);
			return posts;
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
			throw new UmbsBaseException(UmbsBaseErrorCode.QUERY_ERROR);
		}
		
	}

	@Override
	public Post findPostById(int id) throws UmbsBaseException {
		try {
			return repository.findOne((long) id);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
			throw new UmbsBaseException(UmbsBaseErrorCode.QUERY_ERROR);
		}
	}

	@Override
	public Boolean addPost(Post post) throws UmbsBaseException {
		try {
			repository.save(post);
			return true;
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
			throw new UmbsBaseException(UmbsBaseErrorCode.ADD_POST_ERROR);
		}	
	}

	@Override
	public Boolean deletePost(int id) throws UmbsBaseException {
		try {
			repository.delete((long) id);
			return true;
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
			throw new UmbsBaseException(UmbsBaseErrorCode.DELETE_POST_ERROR);
		}
		
	}

}
