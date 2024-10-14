package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//  스프링이 얘를 읽어서 자동으로 등록하도록 하는 어노테이션
@ComponentScan (
        basePackages = "hello.core",  // 여기서부터 시작해서 하위 패키지를 찾는다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
