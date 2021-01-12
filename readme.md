#My Springboot application
    1.首页配置：注意点，所有页面的静态资源搜需要使用thymeleaf接管
    2.页面国际化:注意点：
        1.配置i18n文件
        2.我们如果需要在项目中进行按钮自动切换，我们需要自定义一个组件 LocaleResolver
        3.将自己的组件配置到Spring容器中 @Bean
        4.#{}
    