package org.cpm.zerowastelife.commons.utils;

import org.cpm.zerowastelife.commons.response.JsonResponse;

public class JsonResponseUtil {

	public static <T> JsonResponse<T> getSuccess(T value, String message) {
		JsonResponse<T> response = new JsonResponse<>();
		response.setSuccess(true);
		response.setValues(value);
		response.setMessage(message);
		return response;
	}
}
