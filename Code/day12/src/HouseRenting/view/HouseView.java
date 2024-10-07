package HouseRenting.view;

import HouseRenting.domain.House;
import HouseRenting.service.HouseService;
import HouseRenting.utils.Utility;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.sql.SQLOutput;

public class HouseView {
    private boolean loop=true;
    private char key;

    public HouseService houseService=new HouseService(20);
    //通过创建对象实现两个不同类直接的联系。
    public void mainMenu(){
        do {
            System.out.println("==========房屋出租系统==========");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋");
            System.out.println("\t\t4 修 改 房 屋");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退 出 系 统");
            System.out.println("请输入你的选择：");
            key= Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    search();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    break;
            }
        }while(loop);
    }
    public void listHouse(){
        System.out.println("==========房屋出租信息==========");
        System.out.println("编号  房主  电话  地址  月租  状态");
        House[] houses=houseService.list();
        for(int i=0;i<houses.length;i++){
            if(houses[i]==null){
                break;  //如果为空则不用显示了
            }
            System.out.println(houses[i]);
        }
        System.out.println("==========列表显示完毕==========");
    }
    public void addHouse(){
        System.out.println("==========添加房屋信息==========");
        System.out.println("姓名：");
        String name=Utility.readString(8);
        System.out.println("电话：");
        String phone=Utility.readString(12);
        System.out.println("地址：");
        String address=Utility.readString(16);
        System.out.println("月租：");
        int rent=Utility.readInt();
        System.out.println("状态：");
        String state=Utility.readString(3);
        House house = new House(0,name,phone,address,rent,state);
        if(houseService.add(house)){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
    public void delHouse(){
        System.out.println("==========删除房屋信息==========");
        System.out.println("请输入待删除房屋的编号（-1退出）：");
        int delId=Utility.readInt();
        if(delId==-1){
            System.out.println("已退出删除操作。");
            return ;
        }
        House[] houses=houseService.list();
        for(int i=0;i<houses.length;i++){
            if(houses[i]==null) {
                break;
            }
            if(houses[i].getId()==delId){
                System.out.println(houses[i]);
            }
        }
        if(Utility.readConfirmSelection()=='Y'){
            houseService.del(delId);
        }else{
            System.out.println("已退出删除操作。");
            return ;
        }
        return;
    }
    public void exit(){
        if(Utility.readConfirmSelection()=='Y')
            loop=false;
    }
    public void search(){
        System.out.println("==========查找房屋信息==========");
        System.out.println("请输入待查找房屋的编号（-1退出）：");
        int Id=Utility.readInt();
        if(Id==-1){
            System.out.println("已退出查找操作。");
            return ;
        }
        houseService.searchid(Id);
        return;
    }
    public void update() {
        System.out.println("==========修改房屋信息==========");
        System.out.println("请输入待修改房屋的编号（-1退出）：");
        int Id=Utility.readInt();
        if(Id==-1){
            System.out.println("已退出修改操作。");
            return ;
        }
        int temp=houseService.searchid(Id);
        if(temp!=-1){
            houseService.updateid(temp);
        }
        return;
    }
}
