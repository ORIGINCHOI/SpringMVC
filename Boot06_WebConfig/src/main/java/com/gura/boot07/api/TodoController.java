package com.gura.boot07.api;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  spring 5.0 부터 추가된 RestController 어노테이션을 붙이면
 *  
 *  json 문자열을 응답할 때 @ResponseBody 를 생략할 수 있다.
 *  
 */
@RestController
public class TodoController {
	//할일 추가 요청 처리
	@PostMapping("/api/todo/insert")
	public Map<String, Object> insert(){
		
		return null;
	}
	//할일 목록 요청 처리
	@GetMapping("/api/todo/list")
	public List<Object> list(){
		
		return null;
	}
}
