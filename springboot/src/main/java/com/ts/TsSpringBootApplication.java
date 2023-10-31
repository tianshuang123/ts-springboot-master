package com.ts;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @BelongsProject: ts-springboot-master
 * @BelongsPackage: PACKAGE_NAME
 * @Author: ts  happyBoy
 * @CreateTime: 2023-10-31  22:09
 * @Description: TODO
 * @Version: 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TsSpringBootApplication {
}
