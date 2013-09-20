/**
 * Created on  13-09-19 21:53
 */
package com.taobao.geek.jetcache.spring.beans;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author yeli.hl
 */
@Component
public class ServiceImpl implements Service, Foo {
    @Override
    @Cacheable("books")
    public int foo(){
        return 0;
    }

}