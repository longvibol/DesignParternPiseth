package com.pisethjava.proxy.document;

import java.util.Set;

public record CurrentUser(
		String userId,
		Set<String> permissions
		) {

}
