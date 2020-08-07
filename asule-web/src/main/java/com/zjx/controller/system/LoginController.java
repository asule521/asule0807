package com.zjx.controller.system;

import com.zjx.common.core.domain.AjaxResult;
import com.zjx.common.core.domain.model.LoginBody;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author zhangjinxing
 * @date 2020/8/7 15:28
 * @description
 */
@RestController
@Api(tags = "登录入口")
public class LoginController {
    @PostMapping("/login")
    @ApiOperation("登录验证")
    public AjaxResult login(@RequestBody LoginBody loginBody){

      AjaxResult success = AjaxResult.success();
      return AjaxResult.success();

    }
}
