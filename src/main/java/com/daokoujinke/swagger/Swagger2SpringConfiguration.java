package com.daokoujinke.swagger;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.*;
import springfox.documentation.schema.AlternateTypeRule;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.reflect.WildcardType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Configuration
@EnableSwagger2
public class Swagger2SpringConfiguration {
    @Bean
    public Docket api(){
        ParameterBuilder builder = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        builder.name("Authorization").description("身份信息")//name表示名称，description表示描述
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).defaultValue(null).build();//required表示是否必填，defaultValue表示默认值
        pars.add(builder.build());//添加完此处一定要把下面带***的也加上否则不生效 this is a demo
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .globalOperationParameters(pars)
                .pathMapping("/")
                .directModelSubstitute(LocalDate.class,String.class)
                .genericModelSubstitutes(ResponseEntity.class)
                .alternateTypeRules(
                        new AlternateTypeRule(typeResolver.resolve(DeferredResult.class,typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
                        typeResolver.resolve(WildcardType.class)))
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET,newArrayList(new ResponseMessageBuilder().code(500).message("500 message").responseModel(new ModelRef("Error")).build()))
                .securitySchemes(newArrayList(apiKey()))
                .securityContexts(newArrayList(securityContext()))
                //.enableUrlTemplating(true)
                //.globalOperationParameters(
                        //newArrayList(new ParameterBuilder().name("someGlobalParamter").description("Description of someGlobalParamter")
                        //.modelRef(new ModelRef("string")).parameterType("query").required(true).build()))
                ;
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("urule_client项目API").termsOfServiceUrl("https://git.oschina.net/suntea")
                .contact(new Contact("hello","http://www.daokoujinke.com","oog@163.com")).version("1.0.0").build();
    }

    @Autowired
    private TypeResolver typeResolver;

    private ApiKey apiKey(){
        return new ApiKey("mykey","Authorization","header");
    }

    private SecurityContext securityContext(){
        return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.regex("anyPath.*")).build();
    }

    List<SecurityReference> defaultAuth(){
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return newArrayList(new SecurityReference("mykey",authorizationScopes));
    }

    @Bean
    SecurityConfiguration security() {
        return new SecurityConfiguration("test-app-client-id", "test-app-client-secret", "test-app-realm", "test-app", "Bearer ", ApiKeyVehicle.HEADER,
                "Authorization", "," /* scope separator */);
    }

    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration("validatorUrl");
    }
}
