# Thread

1) 线程的三种实现方式

- 实现Runnable接口，成为Thread类的构造方法的参数，用start激活
- 继承Thread，实例化后直接start
- 实现Callable ,实现call方法，依赖FutureTask对象，再new Thread（FutureTask），再start



#### 线程池

1) newCachedThreadPool 缓存线程池  如果新的线程进来之前，该线程池里已经有了线程，那么会把原来执行过的线程再执行一遍，再执行新进来的线程
2) newFixedThreadPool 固定线程池  ，固定每次运行的线程的数量
3) newScheduledThreadPool 任务计划（延时）线程池
4) newSingleThreadExecutor 单例线程池（这个线程池一次只能有一个线程）
5) newWorkStealingPool   足够大小的线程池

