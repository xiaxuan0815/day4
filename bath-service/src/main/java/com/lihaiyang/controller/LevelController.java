package com.lihaiyang.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lihaiyang.service.LevelService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihaiyang
 * @since 2020-11-12
 */
@RestController
@RequestMapping("/level")
public class LevelController {
	@Autowired
	private LevelService levelService;
}
