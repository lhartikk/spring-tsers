package org.tsers.springtsers;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TsersController {

	@RequestMapping("/")
	public String index() {
		return "tori piste";
	}

	@RequestMapping("/tsers")
	public String tsers() {
		String a = "tsers";
		String b = "piste";
		String c = "fi";

		return Arrays.asList(a, b, c).stream().collect(Collectors.joining(" "));
	}

}
