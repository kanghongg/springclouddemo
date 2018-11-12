package com.kang.zuul.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;
@Primary
@Component
public class DocumentationConfig implements SwaggerResourcesProvider{
    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        resources.add(swaggerResource("user-service", "/api/user/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("account-service", "/api/account/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("customer-service", "/api/customer/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("product-service", "/api/product/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("transfer-service", "/api/transfer/v2/api-docs", "2.0"));
        return resources;
    }
    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
