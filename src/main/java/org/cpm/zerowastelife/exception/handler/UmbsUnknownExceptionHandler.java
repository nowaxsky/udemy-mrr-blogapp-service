package org.cpm.zerowastelife.exception.handler;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

import org.cpm.zerowastelife.commons.contraints.UmbsBaseErrorCode;
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
public class UmbsUnknownExceptionHandler {
	private final Logger logger = UmbsLogFactory.getLogger(UmbsUnknownExceptionHandler.class);
	
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public JsonResponse<String> handlerError(HttpServletRequest req, Exception e) {
		logger.error(UmbsBaseErrorCode.UNKNOWN_ERROR.getErrorCode(), e);
		JsonResponse<String> response = JsonResponseUtil.getFail(UmbsBaseErrorCode.UNKNOWN_ERROR.getErrorCode(), e.getMessage());
		return response;
	}
}
