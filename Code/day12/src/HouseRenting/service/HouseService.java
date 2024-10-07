package HouseRenting.service;

import HouseRenting.domain.House;
import HouseRenting.utils.Utility;

public class HouseService {
    private House[] house;
    private int houseNum=0;
    public HouseService(int size){
        house=new House[size];
    }

    public House[] list(){
        return house;
    }

    public boolean add(House house){
        if(houseNum>=this.house.length){
            System.out.println("数组已满，不能添加了");
            return false;
        }
        this.house[houseNum++]=house;
        this.house[houseNum-1].setId(houseNum);
        return true;
    }

    public boolean del(int delId){
        int index=-1;
        for(int i=0;i<houseNum;i++){
            if(house[i]==null) {
                break;
            }
            if(house[i].getId()==delId){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("不存在对应编号为"+delId+"的房屋");
            return false;
        }
        for(int i=index;i<houseNum-1;i++){
            house[i]=house[i+1];
        }
        house[houseNum-1]=null;
        houseNum--;
        System.out.println("已删除对应编号为"+delId+"的房屋");
        return true;
    }
    public int searchid(int id){
        for(int i=0;i<houseNum;i++){
            if(house[i].getId()==id){
                System.out.println("查询的房屋信息如下：");
                System.out.println(house[i]);
                return i;
            }
        }
        System.out.println("为查找到对应id的房屋信息。");
        return -1;
    }
    public void updateid(int index){
        System.out.println(house[index]);
        System.out.println("==========修改房屋信息==========");
        System.out.println("姓名：");
        house[index].setName(Utility.readString(8));
        System.out.println("电话：");
        house[index].setPhone(Utility.readString(12));
        System.out.println("地址：");
        house[index].setAddress(Utility.readString(16));
        System.out.println("月租：");
        house[index].setRent(Utility.readInt());
        System.out.println("状态：");
        house[index].setState(Utility.readString(3));
        System.out.println("修改成功！");
        System.out.println("==========修改后的房屋信息==========");
        System.out.println(house[index]);
    }
}
