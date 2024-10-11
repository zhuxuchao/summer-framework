package com.zhuxc.summerframework.context.annotation;

import java.lang.annotation.*;

/**
 * @auther zhuxc
 * @date 2024/10/11 19:22
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    /**
     * Bean name. Default to simple class name with first-letter-lowercase.
     */
    String value() default "";

}
