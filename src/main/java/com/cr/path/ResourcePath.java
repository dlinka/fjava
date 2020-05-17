package com.cr.path;

public class ResourcePath {

    public void classResource() {
        //class.getResource方法和class.getResourceAsStream方法在使用时路径选择上是一样的

        //当前类所在目录
        //file:/Users/dlinka/IdeaProjects/fjava/target/classes/com/cr/path/
        System.out.println(ResourcePath.class.getResource(""));

        //classpath根路径
        //file:/Users/dlinka/IdeaProjects/fjava/target/classes/
        System.out.println(ResourcePath.class.getResource("/"));
    }

    public void classloaderResource(){
        //class.getClassLoader().getResource方法和class.getClassLoader().getResourceAsStream方法在使用时路径选择上是一样的

        //classpath根路径
        //file:/Users/dlinka/IdeaProjects/fjava/target/classes/
        System.out.println(ResourcePath.class.getClassLoader().getResource(""));

        //null
        System.out.println(ResourcePath.class.getClassLoader().getResource("/"));
    }

    public static void main(String[] args) {
        ResourcePath path = new ResourcePath();
        path.classResource();
        path.classloaderResource();
    }

}
