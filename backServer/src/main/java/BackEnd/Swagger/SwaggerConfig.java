package BackEnd.Swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurationSupport{
    
    @Bean
    public Docket newApi(){
        return new Docket(DocumentationType.SWAGGER_2)
        .groupName("00. All Rest Api Service")
        .apiInfo(apiInfo())
        .select()
        .paths(PathSelectors.any())
        .apis(RequestHandlerSelectors.basePackage("BackEnd.BackRestApi"))
        .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
            .title("이재욱 - Swagger Page")
            .description("전자정부표준프레임워크 하이브리드앱 실행환경 - Rest 서비스")
            .termsOfServiceUrl("https://github.com/nabidana")
            .license("Apache License Version 2.0")
            .licenseUrl("https://www.egovframe.go.kr")
            .version("3.10")
            .build();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        
        super.addResourceHandlers(registry);
    }
}
