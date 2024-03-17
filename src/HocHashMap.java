import java.util.HashMap;

/**
 * HocHashMap
 */
public class HocHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> ds = new HashMap<Integer, String>();
        ds.put(113, "nguyen huy hoang");
        ds.put(114, "nguyen huy a");
        ds.put(115, "nguyen huy b");
        String x = ds.get(114);
        System.out.println(x);
        System.out.println("toan bo nhan vien la: ");
        for(String ten: ds.values()){
            System.out.println(ten);
        }
        System.out.println("ds sau khi sua: ");
        ds.remove(115);
        for(String ten: ds.values()){
            System.out.println(ten);
        }
    }
}