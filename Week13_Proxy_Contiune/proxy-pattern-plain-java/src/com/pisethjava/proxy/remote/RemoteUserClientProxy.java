package com.pisethjava.proxy.remote;

public class RemoteUserClientProxy implements UserClient {

	// this is like the remote service
	@Override
	public UserResponse getUser(String userId) {
		System.out.println("Serialize rquest"); // convert object to json
		System.out.println("Call remote user-service");
		System.out.println("Deserialize response");
		
		
		return new UserResponse(userId, "Demo User");
	}

}
