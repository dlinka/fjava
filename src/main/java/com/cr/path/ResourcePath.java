package com.cr.path;

public class ResourcePath {

    public static void main(String[] args) {
        classloaderResource();
    }

    private static void classResource() {
        //class.getResource方法和class.getResourceAsStream方法在使用时,路径选择上是一样的
        //当前类所在目录
        System.out.println(ResourcePath.class.getResource("")); //file:/Users/dlinka/IdeaProjects/fjava/target/classes/com/cr/
        //classpath根路径
        System.out.println(ResourcePath.class.getResource("/")); //file:/Users/dlinka/IdeaProjects/fjava/target/classes/
    }

    private static void classloaderResource(){
        //class.getClassLoader().getResource方法和class.getClassLoader().getResourceAsStream方法在使用时,路径选择上是一样的
        //classpath根路径
        System.out.println(ResourcePath.class.getClassLoader().getResource("")); //file:/Users/dlinka/IdeaProjects/fjava/target/classes/
        //null
        System.out.println(ResourcePath.class.getClassLoader().getResource("/")); //null
    }
}
