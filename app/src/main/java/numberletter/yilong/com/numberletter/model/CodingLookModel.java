package numberletter.yilong.com.numberletter.model;

import java.util.ArrayList;

import numberletter.yilong.com.numberletter.R;

/**
 * Created by zhkqy on 16/3/28.
 * <p/>
 * 编码展示类 数据
 */
public class CodingLookModel {

    ArrayList<Integer> codingImg = new ArrayList<Integer>();
    ArrayList<String> codingNickname = new ArrayList<String>();
    ArrayList<String> codingNumber = new ArrayList<String>();

    public CodingLookModel() {

    }

    public ArrayList<String> getCodingNumber() {

        codingNumber.clear();

        for (int x = 0; x < 100; x++) {
            codingNumber.add(x + "");
        }
        codingNumber.add("00");
        codingNumber.add("01");
        codingNumber.add("02");
        codingNumber.add("03");

        codingNumber.add("04");
        codingNumber.add("05");
        codingNumber.add("06");
        codingNumber.add("07");

        codingNumber.add("08");
        codingNumber.add("09");
        return codingNumber;
    }

    public ArrayList<String> getCodingNickname() {
        codingNickname.clear();

        codingNickname.add("呼啦圈");
        codingNickname.add("蜡烛");
        codingNickname.add("鸭子");
        codingNickname.add("耳朵");
        codingNickname.add("帆船");
        codingNickname.add("钩子");
        codingNickname.add("勺子");
        codingNickname.add("镰刀");
        codingNickname.add("眼睛");
        codingNickname.add("球拍");
        codingNickname.add("棒球");


        codingNickname.add("梯子");
        codingNickname.add("椅子");
        codingNickname.add("医生");
        codingNickname.add("钥匙");
        codingNickname.add("鹦鹉");
        codingNickname.add("石榴");
        codingNickname.add("仪器");
        codingNickname.add("腰包");
        codingNickname.add("衣钩");
        codingNickname.add("香烟");


        codingNickname.add("鳄鱼");
        codingNickname.add("双胞胎");
        codingNickname.add("和尚");
        codingNickname.add("时钟");
        codingNickname.add("二胡");
        codingNickname.add("河流");
        codingNickname.add("耳机");
        codingNickname.add("恶霸");
        codingNickname.add("饿囚");
        codingNickname.add("三轮车");


        codingNickname.add("鲨鱼");
        codingNickname.add("扇子");
        codingNickname.add("闪闪红星");
        codingNickname.add("丝巾");
        codingNickname.add("山虎");
        codingNickname.add("山鹿");
        codingNickname.add("山鸡");
        codingNickname.add("妇女");
        codingNickname.add("胃康灵");
        codingNickname.add("司令");


        codingNickname.add("蜥蜴");
        codingNickname.add("柿子");
        codingNickname.add("死神");
        codingNickname.add("蛇");
        codingNickname.add("师傅");
        codingNickname.add("饲料");
        codingNickname.add("司机");
        codingNickname.add("石板");
        codingNickname.add("湿狗");
        codingNickname.add("五环");


        codingNickname.add("工人");
        codingNickname.add("鼓");
        codingNickname.add("乌纱帽");
        codingNickname.add("青年");
        codingNickname.add("火车");
        codingNickname.add("蜗牛");
        codingNickname.add("武器");
        codingNickname.add("尾巴");
        codingNickname.add("蜈蚣");
        codingNickname.add("榴莲");


        codingNickname.add("儿童");
        codingNickname.add("牛");
        codingNickname.add("流沙");
        codingNickname.add("螺丝");
        codingNickname.add("尿壶");
        codingNickname.add("蝌蚪");
        codingNickname.add("油漆");
        codingNickname.add("喇叭");
        codingNickname.add("料酒");
        codingNickname.add("冰淇淋");


        codingNickname.add("鸡翅");
        codingNickname.add("企鹅");
        codingNickname.add("花旗参");
        codingNickname.add("骑士");
        codingNickname.add("西服");
        codingNickname.add("汽油");
        codingNickname.add("机器人");
        codingNickname.add("青蛙");
        codingNickname.add("气球");
        codingNickname.add("巴黎铁塔");


        codingNickname.add("白蚁");
        codingNickname.add("靶子");
        codingNickname.add("芭蕉扇");
        codingNickname.add("巴士");
        codingNickname.add("宝物");
        codingNickname.add("八路");
        codingNickname.add("白棋");
        codingNickname.add("爸爸");
        codingNickname.add("芭蕉");
        codingNickname.add("酒瓶");


        codingNickname.add("球衣");
        codingNickname.add("球");
        codingNickname.add("九三");
        codingNickname.add("旧首饰");
        codingNickname.add("救护车");
        codingNickname.add("旧炉");
        codingNickname.add("旧旗");
        codingNickname.add("球拍");
        codingNickname.add("中国澳门");


        codingNickname.add("望远镜");
        codingNickname.add("小树");
        codingNickname.add("铃铛");
        codingNickname.add("三脚凳");
        codingNickname.add("汽车");
        codingNickname.add("手套");
        codingNickname.add("手枪");
        codingNickname.add("锄头");
        codingNickname.add("溜冰鞋");
        codingNickname.add("猫");


        return codingNickname;
    }

    public ArrayList<Integer> getCodingImgArraylist() {
        codingImg.clear();

        codingImg.add(R.mipmap.bianma_0);
        codingImg.add(R.mipmap.bianma_1);
        codingImg.add(R.mipmap.bianma_2);
        codingImg.add(R.mipmap.bianma_3);
        codingImg.add(R.mipmap.bianma_4);
        codingImg.add(R.mipmap.bianma_5);
        codingImg.add(R.mipmap.bianma_6);
        codingImg.add(R.mipmap.bianma_7);
        codingImg.add(R.mipmap.bianma_8);
        codingImg.add(R.mipmap.bianma_9);
        codingImg.add(R.mipmap.bianma_10);

        codingImg.add(R.mipmap.bianma_11);
        codingImg.add(R.mipmap.bianma_12);
        codingImg.add(R.mipmap.bianma_13);
        codingImg.add(R.mipmap.bianma_14);
        codingImg.add(R.mipmap.bianma_15);
        codingImg.add(R.mipmap.bianma_16);
        codingImg.add(R.mipmap.bianma_17);
        codingImg.add(R.mipmap.bianma_18);
        codingImg.add(R.mipmap.bianma_19);
        codingImg.add(R.mipmap.bianma_20);


        codingImg.add(R.mipmap.bianma_21);
        codingImg.add(R.mipmap.bianma_22);
        codingImg.add(R.mipmap.bianma_23);
        codingImg.add(R.mipmap.bianma_24);
        codingImg.add(R.mipmap.bianma_25);
        codingImg.add(R.mipmap.bianma_26);
        codingImg.add(R.mipmap.bianma_27);
        codingImg.add(R.mipmap.bianma_28);
        codingImg.add(R.mipmap.bianma_29);
        codingImg.add(R.mipmap.bianma_30);


        codingImg.add(R.mipmap.bianma_31);
        codingImg.add(R.mipmap.bianma_32);
        codingImg.add(R.mipmap.bianma_33);
        codingImg.add(R.mipmap.bianma_34);
        codingImg.add(R.mipmap.bianma_35);
        codingImg.add(R.mipmap.bianma_36);
        codingImg.add(R.mipmap.bianma_37);
        codingImg.add(R.mipmap.bianma_38);
        codingImg.add(R.mipmap.bianma_39);
        codingImg.add(R.mipmap.bianma_40);


        codingImg.add(R.mipmap.bianma_41);
        codingImg.add(R.mipmap.bianma_42);
        codingImg.add(R.mipmap.bianma_43);
        codingImg.add(R.mipmap.bianma_44);
        codingImg.add(R.mipmap.bianma_45);
        codingImg.add(R.mipmap.bianma_46);
        codingImg.add(R.mipmap.bianma_47);
        codingImg.add(R.mipmap.bianma_48);
        codingImg.add(R.mipmap.bianma_49);
        codingImg.add(R.mipmap.bianma_50);


        codingImg.add(R.mipmap.bianma_51);
        codingImg.add(R.mipmap.bianma_52);
        codingImg.add(R.mipmap.bianma_53);
        codingImg.add(R.mipmap.bianma_54);
        codingImg.add(R.mipmap.bianma_55);
        codingImg.add(R.mipmap.bianma_56);
        codingImg.add(R.mipmap.bianma_57);
        codingImg.add(R.mipmap.bianma_58);
        codingImg.add(R.mipmap.bianma_59);
        codingImg.add(R.mipmap.bianma_60);

        codingImg.add(R.mipmap.bianma_61);
        codingImg.add(R.mipmap.bianma_62);
        codingImg.add(R.mipmap.bianma_63);
        codingImg.add(R.mipmap.bianma_64);
        codingImg.add(R.mipmap.bianma_65);
        codingImg.add(R.mipmap.bianma_66);
        codingImg.add(R.mipmap.bianma_67);
        codingImg.add(R.mipmap.bianma_68);
        codingImg.add(R.mipmap.bianma_69);
        codingImg.add(R.mipmap.bianma_70);

        codingImg.add(R.mipmap.bianma_71);
        codingImg.add(R.mipmap.bianma_72);
        codingImg.add(R.mipmap.bianma_73);
        codingImg.add(R.mipmap.bianma_74);
        codingImg.add(R.mipmap.bianma_75);
        codingImg.add(R.mipmap.bianma_76);
        codingImg.add(R.mipmap.bianma_77);
        codingImg.add(R.mipmap.bianma_78);
        codingImg.add(R.mipmap.bianma_79);
        codingImg.add(R.mipmap.bianma_80);


        codingImg.add(R.mipmap.bianma_81);
        codingImg.add(R.mipmap.bianma_82);
        codingImg.add(R.mipmap.bianma_83);
        codingImg.add(R.mipmap.bianma_84);
        codingImg.add(R.mipmap.bianma_85);
        codingImg.add(R.mipmap.bianma_86);
        codingImg.add(R.mipmap.bianma_87);
        codingImg.add(R.mipmap.bianma_88);
        codingImg.add(R.mipmap.bianma_89);
        codingImg.add(R.mipmap.bianma_90);

        codingImg.add(R.mipmap.bianma_91);
        codingImg.add(R.mipmap.bianma_92);
        codingImg.add(R.mipmap.bianma_93);
        codingImg.add(R.mipmap.bianma_94);
        codingImg.add(R.mipmap.bianma_95);
        codingImg.add(R.mipmap.bianma_96);
        codingImg.add(R.mipmap.bianma_97);
        codingImg.add(R.mipmap.bianma_98);
        codingImg.add(R.mipmap.bianma_99);

        codingImg.add(R.mipmap.bianma_00);
        codingImg.add(R.mipmap.bianma_01);
        codingImg.add(R.mipmap.bianma_02);
        codingImg.add(R.mipmap.bianma_03);
        codingImg.add(R.mipmap.bianma_04);
        codingImg.add(R.mipmap.bianma_05);
        codingImg.add(R.mipmap.bianma_06);
        codingImg.add(R.mipmap.bianma_07);
        codingImg.add(R.mipmap.bianma_08);
        codingImg.add(R.mipmap.bianma_09);

        return codingImg;
    }
}
