package org.acme;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import lombok.extern.slf4j.Slf4j;

@Path("/api/v1/community/webhooks")
@Slf4j
public class CommunityController {
	@POST
	public void webhooks(@QueryParam(value = "key") String key, String payload) {
		log.info(String.format("key:[%s] payload:[%s]", key, payload));
	}
}
