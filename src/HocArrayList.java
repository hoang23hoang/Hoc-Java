import java.util.ArrayList;

/**
 * Mang
 */
public class HocArrayList {

    public static void main(String[] args) {
        // ArrayList ds = new ArrayList();
        // ds.add('x');
        // ds.add(9);
        // ArrayList ds2 = new ArrayList();
        // ds2.add("1.5");
        ArrayList ds3 = new ArrayList();
        ds3.add("an");
        ds3.add("binh");
        ds3.add("giai");
        ds3.add("thoat");
        ds3.add(2,"Hoang");
        for(int i = 0; i < ds3.size();i++){
            String x = ds3.get(i)+"";
             System.out.println(x);
        }
        for(Object data: ds3){
            System.out.println(data);
        }
       
        ArrayList<Float> ds5 = new ArrayList<Float>();
        ds5.add(1.5f);
        for(float y: ds5){
            System.out.println(y);
        }
    }
}