package com.pisethjava.proxy.before;

import java.util.Set;

public record CurrentUser(
		String userId,
		Set<String> permissions
		) {

}
