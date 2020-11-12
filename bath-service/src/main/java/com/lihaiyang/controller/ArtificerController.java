package com.lihaiyang.controller;


import com.lihaiyang.entity.Artificer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lihaiyang.service.ArtificerService;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihaiyang
 * @since 2020-11-12
 */
@RestController
@RequestMapping("/artificer")
public class ArtificerController {
	@Autowired
	private ArtificerService artificerService;

	@GetMapping("get-by-id")
	public Artificer getById(Long id){
		return artificerService.getById(id);
	}

	@GetMapping("list")
	public List<Artificer> list(){
		return artificerService.list();
	}
}
