package ChrisHofer.Rabbit;

import java.util.Comparator;

public class HaseNamenComparator implements Comparator<Hase> {
    @Override
    public int compare(Hase o1, Hase o2) {
        return o1.getName().compareTo(o2.getName());

        //wenn wir 2 kriterien hätten
//        int ret = o1.getName().compareTo(o2.getName();
//        if( ret == 0) {
//            //ist gleich - witer mit alter vergleichen
//        } else {
//            return ret;
//        }
    }
}
