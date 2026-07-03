package com.piseth.solid;

import com.piseth.solid.l_lsp.bad.Bird;
import com.piseth.solid.l_lsp.bad.BirdService;
import com.piseth.solid.l_lsp.bad.Penguin;

public class TestLSP {

	public static void main(String[] args) {
		BirdService birdService = new BirdService();
		Bird parot = new Bird();		
		Bird penguin = new Penguin();
		
		birdService.makeBirdFly(penguin);

	}

}
