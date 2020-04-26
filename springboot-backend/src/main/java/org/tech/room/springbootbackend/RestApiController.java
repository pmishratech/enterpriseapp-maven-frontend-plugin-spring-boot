/**
 * 
 */
package org.tech.room.springbootbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestApiController {
	
	@GetMapping
	public String get() {

		return "hello";
	}

}
