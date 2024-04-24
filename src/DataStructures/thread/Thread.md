# Thread

1) 线程的三种实现方式

- 实现Runnable接口，成为Thread类的构造方法的参数，用start激活
- 继承Thread，实例化后直接start
- 实现Callable ,实现call方法，依赖FutureTask对象，再new Thread（FutureTask），再start



