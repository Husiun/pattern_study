设计模式之观察者模式
1.通过JDK里面的被观察者类observable (java.util.Observable)和观察者类Observer(java.util.Observer)实现观察者模式
2.自己定义也就是订阅，通知，移除订阅的流程；观察者应该有个update方法，被观察者有对应的注册，通知，移除方法，
注册观察者，可以持有list的观察者对象，对其add;通知观察者就是对list的一个遍历；移除就是list.remove，当然前提是
在判断list里面有的情况。
观察者模式也叫订阅模式