package org.cpm.zerowastelife.exception.handler;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

import org.cpm.zerowastelife.commons.log.factories.UmbsLogFactory;
import org.cpm.zerowastelife.commons.response.JsonResponse;
import org.cpm.zerowastelife.commons.utils.JsonResponseUtil;
import org.cpm.zerowastelife.exception.UmbsBaseException;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UmbsBaseExceptionHandler {
	private final Logger logger = UmbsLogFactory.getLogger(UmbsBaseExceptionHandler.class);
	
	@ExceptionHandler(value = UmbsBaseException.class)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public JsonResponse<String> handlerError(HttpServletRequest req, UmbsBaseException e) {
		logger.error(e.getErrorCode(), e);
		JsonResponse<String> response = JsonResponseUtil.getFail(e.getErrorCode(), e.getMessage());
		return response;
	}
}
