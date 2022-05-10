package com.audit.checklist.service;
/**
 * 
 * This class is implementing {@link TokenService}.
 * The method of this class is used in other classes to validate token received.
 *
 */
import com.audit.checklist.clients.AuthClient;
import com.audit.checklist.model.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import feign.FeignException;

@Service
public class TokenService implements TokenServiceInt{
	/**
	 * Interface interacting with Auth microservice
	 */
	@Autowired
	private AuthClient authClient;
	
	public Boolean checkTokenValidity(String token)  {
		try {
			AuthResponse authResponse = authClient.getValidity(token).getBody();
			if (authResponse==null) return false;
			return authResponse.isValid();	
		}
		catch(FeignException e) {
			return false;
		}
	}
}
