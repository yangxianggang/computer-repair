package com.example.util;

import org.mybatis.generator.api.JavaTypeResolver;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

public class TinyIntJavaTypeResolver extends JavaTypeResolverDefaultImpl {
    public TinyIntJavaTypeResolver() {
        super();
        typeMap.put(Types.TINYINT, new JavaTypeResolverDefaultImpl
                .JdbcTypeInformation("" +
                "tinyint", new FullyQualifiedJavaType(Integer.class.getName())));

    }
}
