package org.cpm.zerowastelife.presentation;

import java.util.List;

import org.apache.log4j.Logger;
import org.cpm.zerowastelife.commons.response.JsonResponse;
import org.cpm.zerowastelife.commons.utils.JsonResponseUtil;
import org.cpm.zerowastelife.entity.Post;
import org.cpm.zerowastelife.exception.UmbsBaseException;
import org.cpm.zerowastelife.presentation.interfaces.UdemyMrrBlogappRest;
import org.cpm.zerowastelife.service.UdemyMrrBlogappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/umbs")
public class UdemyMrrBlogappController implements UdemyMrrBlogappRest{

	private final Logger logger = Logger.getLogger(UdemyMrrBlogappController.class);
	private UdemyMrrBlogappService service;
	
	@Autowired
	public void setService(UdemyMrrBlogappService service) {
		this.service = service;
	}
	
	@Override
	public JsonResponse<List<Post>> findAllPosts() throws UmbsBaseException {		
		try {
			JsonResponse<List<Post>> response = null;
			List<Post> result = service.findAllPosts();
			response = JsonResponseUtil.getSuccess(result, "successful");
			return response;
		} catch (UmbsBaseException e) {
			logger.error(e);
			throw e;
		}
	}

	@Override
	public JsonResponse<Post> findPostById(int id) throws UmbsBaseException {
		try {
			JsonResponse<Post> response = null;
			Post result = service.findPostById(id);
			response = JsonResponseUtil.getSuccess(result, "successful");
			return response;
		} catch (UmbsBaseException e) {
			logger.error(e);
			throw e;
		}		
	}

	@Override
	public JsonResponse<Boolean> addPost(Post post) throws UmbsBaseException {
		try {
			JsonResponse<Boolean> response = null;
			Boolean isSuccess = service.addPost(post);
			response = JsonResponseUtil.getSuccess(isSuccess, "successful");
			return response;
		} catch (UmbsBaseException e) {
			logger.error(e);
			throw e;
		}
	}

	@Override
	public JsonResponse<Boolean> deletePost(int id) throws UmbsBaseException {
		try {
			JsonResponse<Boolean> response = null;
			Boolean isSuccess = service.deletePost(id);
			response = JsonResponseUtil.getSuccess(isSuccess, "successful");
			return response;
		} catch (UmbsBaseException e) {
			logger.error(e);
			throw e;
		}
	}

}
