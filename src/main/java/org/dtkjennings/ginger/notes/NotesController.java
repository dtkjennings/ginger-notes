package org.dtkjennings.ginger.notes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotesController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
