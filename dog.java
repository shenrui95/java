Object o = new Dog();
int i = o.hashCode();  // 可行，因为Object本身有hashCode()方法
o.makeNoise(); // 不可执行，因为此时o的引用类型是Object，Object没有makeNoise()方法，无法执行。
Animal a = (Dog) o;
a.makeNoise(); // 可行，当o赋值给a时进行了类型转换，Dog是Animal的子类，所以可以赋值成功。Animal有makeNoise()方法，所以可以执行