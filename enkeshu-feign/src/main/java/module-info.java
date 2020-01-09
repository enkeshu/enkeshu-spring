/**
 * @Author radish.zhou
 * @date 2020/1/7 11:27
 */
module enkeshu.feign {
    requires spring.cloud.openfeign.core;
    requires lombok;
    requires feign.core;
    requires enkeshu.core;
    exports com.enkeshu.spring.feign.client;
    exports com.enkeshu.spring.feign.request;
    exports com.enkeshu.spring.feign.response;
}