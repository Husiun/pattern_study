设计模式之装饰器模式  Decorator pattern
模式构成角色：
Component  抽象类或者接口
ConcreteComponent 实现类
Decorator  装饰器类，实现或者继承了Component，有一个private 的变量为Component
ConcreteComponent 具体的装饰器类，针对特定方法定义private方法进行修饰

装饰器模式也成为包装器(Wrapper)模式，是对继承很好的补充，不需要单独通过继承来增加已有的功能，而是通过关联实现，
使得项目更加灵活，避免了累赘的负担
涉及到该模式的应用：
1.java IO 输入输出流的设计
2.servlet中对request的装饰类，HttpServletRequestWrapper,增强了request的功能

