public interface Shape {
    default void draw(){
        System.out.println("The "+ this.getClass().getName() + " is drawn");
    };
    default String toStr(String param){
        return this.getClass().getName() + "{ " + param + " }";
    }
}
