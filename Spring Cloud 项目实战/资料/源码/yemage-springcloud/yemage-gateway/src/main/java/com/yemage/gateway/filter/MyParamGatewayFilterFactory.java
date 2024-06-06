package com.yemage.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
@author yemage
*/
@Component
public class MyParamGatewayFilterFactory extends AbstractGatewayFilterFactory<MyParamGatewayFilterFactory.Config> {



    public MyParamGatewayFilterFactory() {
        super(MyParamGatewayFilterFactory.Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("param");
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange,chain) -> {
            //http://localhost:10010/api/user/8?name=yemage   config.param = name

            ServerHttpRequest req = exchange.getRequest();
            if (req.getQueryParams().containsKey(config.param)){
                req.getQueryParams().get(config.param).forEach((v) -> {
                    System.out.printf("--局部过滤器--获得参数 %s = %s----",config.param,v);
                });
            }
            return chain.filter(exchange); //执行请求

        };
    }


    //读取过滤器配置的参数
    public static class Config {

        //对应application.yml配置文件中的过滤器参数
        private String param;

        public String getParam() {
            return param;
        }

        public void setParam(String param) {
            this.param = param;
        }

    }

}
