*主要使用
一、异常
1、捕获异常
2、抛出异常
3、自定义异常
二、集合
1、Set:无序、不可重复的集合
  *HashSet(TestHashSet):无序(判断hashcode值)、不可重复、可以存null、有线程安全问题。
   TreeSet(TestTreeSet or 1):有序.自然排序(TreeSet会调用集合元素的compareTo(Object obj)
           方法来比较元素之间的大小关系，然后将集合元素按升序排序
           )、不可重复、有线程安全问题。
2、List:有序、可重复的集合
  *ArrayList(TestArrayList):有序(根据元素添加顺序添加索引)、可重复、线程安全问题。
   Vector:无线程安全问题，不推荐使用。
3、Map:具有映射关系的集合(TestHashMap)
  *HashMap:无序、线程安全问题、允许空key与value。
   TreeMap:有序(自然排序(默认按照key大小排序)、定制排序)
   Hashtable:无线程安全问题，不推荐使用，不允许空key与value
4、Collections
   