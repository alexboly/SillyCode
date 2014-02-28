package theApp;

import java.text.DecimalFormat;
import java.util.List;

// File format
//
// ABBBBBCDDDDDEEEEEEE...
//
// A - bytes 0-0   integer portion of field x (range: 0-9)
//     (done this way because we can not represent a decimal number exactly)
//
// B - bytes 1-5   decimal portion of field x (range: 00000-99999 to represent 0.00000-9.99999)
//     (done this way because we can not represent a decimal number exactly)
//
// C - bytes 6-6   integer portion of field y (range: 0-9)
//     (done this way because we can not represent a decimal number exactly)
//
// D - bytes 7-11  decimal portion of field y (range: 00000-99999 to represent 0.00000-9.99999)
//
// E - bytes 12-18 discount rate (range: 0.00000-9.99999)
/**
 * From http://thedailywtf.com/Articles/Printing-Decimal-Numbers-is-HARD!.aspx
 * @author unknown
 *
 */
public class Xyz {

  public class Data {
     private double ab;
     private double cd;
     private double e;

     public Data(double ab, double cd, double e /* ... */ ) {
       this.ab = ab;
       this.cd = cd;
       this.e  = e;
     }

     public double getAB() { return ab; }
     public double getCD() { return cd; }
     public double getE()  { return e;  }
     // ...
  }

  public String createDataToWriteToFile(List<Data> list) {
    DecimalFormat df1 = new DecimalFormat("0.00000");
    DecimalFormat df2 = new DecimalFormat("00000");
    DecimalFormat df3 = new DecimalFormat("0");

    StringBuilder sb = new StringBuilder();

    for (Data d : list) {
        String s = df3.format(Math.floor(d.getAB())) + 
                   df2.format((d.getAB() - Math.floor(d.getAB()))*100000) +
                   df3.format(Math.floor(d.getCD())) + 
                   df2.format((d.getCD() - Math.floor(d.getCD()))*100000) +
                   df1.format(d.getE());
        sb.append(s);
        sb.append("\r\n");
    }

    return sb.toString();
  }
}
