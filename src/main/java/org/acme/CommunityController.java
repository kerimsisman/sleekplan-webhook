package org.acme;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/api/v1/community/webhooks")
public class CommunityController {
	@POST
	public void webhooks(@QueryParam(value = "key") String key, String payload) {
		System.out.println(String.format("key:[%s] payload:[%s]", key, payload));
	}
}
