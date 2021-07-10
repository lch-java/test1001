package com.changyonglei.array.homework;

/**
 * 酒店管理系统的编写
 * 第二题:(java软件工程师人生路上第一个小型项目。锻炼一下面向对象。)
 * 为某个洒店编写程序:酒店管理系统，模拟订房、退房、打印所有房间状态等功能
 * 1、该系统的用户是:酒店前台-
 * 2、酒店使用一个二维数组来模拟。"Room[] [] rooms ; "
 * 3、酒店中的每一个房间应该是一个java对象: Room
 * 4、每一个房间Room应该有:房间编号、房间类型、房间是否空闲.
 * 5-系统应该对外握供的功能:
 * 可以预定房间:用户输入房间编号,订房-
 * 可以退房:用户输入房间编号,退房-
 * 可以查看所有房间的状态:用户输入某个指令应该可以查看所有房间状态。
 */
public class Hotel {
    //酒店大厦框架已声明,没有存房间的地址
    private Room[][] rooms ;

    //构造方法

    public Hotel() {
        rooms = new Room[3][10];
        //初始化所有房间的信息

            for ( int i = 0; i < rooms.length; i++) {  //i是下标,i+1表楼层
                for (int j = 0; j < rooms[i].length; j++) {
                    if (i == 0) {
                        rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", false);
                    } else if (i == 1) {
                        rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", false);
                    } else if (i == 2) {
                        rooms[i][j] = new Room((i + 1) * 100 + j + 1, "总统套房", false);
                    }
                }
            }

    }

    //set和get方法
    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    //打印所有房间状态,输出每个房间重写后的to string方法
    public void print(){
        for (int i = 0; i < rooms.length; i++) {  //i是下标,i+1表楼层
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j].toString() + " ");
            }
            System.out.println(" ");
        }
    }



    //订房方法
    public void order(int roomNo){
        //将初始化的房间信息传给room对象
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        //房间设成有人
        room.setStatus(true);
    }

    //退房方法
    public void exit(int roomNo){
        //将初始化的房间信息传给room对象
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        //房间设成空闲
        room.setStatus(false);
    }


}


//不能继承Hotel类,因为有参构造方法中有super会初始化父类的构造方法,而此时父类的构造方法只声明了一个,父调子,子调父,会出现栈溢出
class Room {

    //房间编号
    private int id;

    //房间类型
    private String roomType;

    /*房间状态
    *true表示有人,不可以预订
    *false表示无人,可以预订
    */
    private boolean status;

    //构造方法
    public Room() {
    }

    public Room(int id, String roomType, boolean status) {
        this.id = id;
        this.roomType = roomType;
        this.status = status;
    }

    //setter和getter方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    //idea工具中生成的boolean类型的get方法是这种形式,可以改成getStatus
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //equals方法的重写,目的比较两个房间java对象是否相等
    public boolean equals(Object obj) {
        if (obj ==null || !(obj instanceof Room))  return false;
        if (this ==obj) return true;
        Room room = (Room) obj;
        return id == room.id;
    }

    //toString方法的重写
    public String toString(){
        return "房间号:" + id + ",房间类型:" + roomType + ",房间状态:" + (status ? "占用" : "空闲");
    }

   /* public static void main(String[] args) {
        Room room = new Room(101,"标准间",true);
        System.out.println(room);
        Room room1 = new Room(102,"标准间",true);
        System.out.println(room1.equals(room));

    }*/

}









