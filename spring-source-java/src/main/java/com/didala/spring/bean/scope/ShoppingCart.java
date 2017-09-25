package com.didala.spring.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * 创建人  ：jiangwei
 * 创建时间：2017/9/24.
 * 购物车
 *  @Scope 设置bean的作用域
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.INTERFACES)
public class ShoppingCart {

}
