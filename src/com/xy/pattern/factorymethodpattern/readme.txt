设计模式之工厂方法模式
  模拟女娲造人的场景，根据火炉造出不同人种
  人类是一个接口，各个人种是实现类，设计模式的关键点在工厂类，利用反射创造新的实体，带有参数的方法根据传入的
  人类种进行创建，在后面添加无参的方法以后根本不用考虑每次指定什么人种，而是随机的；这样设计模式完成；后续的
  扩展性也是廷强的。有新的人种再去实现Human接口就行
  添加map以后，使得设计模式具有了延迟初始化的功能，也就是当一个对象初始化以后，不急着释放存起来，等到再次初始化
  直接从内存中去取就行，不必再次初始化,也有享元的意思