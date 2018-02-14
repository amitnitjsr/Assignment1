
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class DateCheck {
        static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        public static void main(String[] args) throws ParseException {

                Calendar d31 = Calendar.getInstance();
                d31.set(Calendar.YEAR,2017);
                d31.set(Calendar.MONTH,2);
                d31.set(Calendar.DATE,11);


                Calendar d32 = Calendar.getInstance();
                d32.set(Calendar.YEAR,2017);
                d32.set(Calendar.MONTH,2);
                d32.set(Calendar.DATE,13);


                DateCheck.fun(d31,d32);
        }

        private static void fun(Calendar d31, Calendar d32) {


                Calendar d1= Calendar.getInstance();
                d1=d31;
                d1.set(Calendar.DATE,1);


                Calendar d2= Calendar.getInstance();
                d2=d32;


                Date today = new Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(today);
                cal.set(Calendar.HOUR_OF_DAY, 0);
                cal.set(Calendar.MONTH,cal.get(Calendar.MONTH)+1);

                if(d32.after(cal)) {
                        System.out.println(cal.get(Calendar.MONTH));
                        d2.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),cal.get(Calendar.DATE));
                
                }else {
                        if(d32.get(Calendar.MONTH)==cal.get(Calendar.MONTH))
                                d2.set(Calendar.DATE,cal.get(Calendar.DATE));
                        else {
                                d32.set(Calendar.MONTH, d32.get(Calendar.MONTH)-1);
                                d2.set(Calendar.DATE,d32.getActualMaximum(Calendar.DATE));
                        }
                      

                }

                System.out.println("fromdate:"+d1.get(Calendar.YEAR)+"/"+d1.get(Calendar.MONTH)+"/"+d1.get(Calendar.DATE));
                System.out.println("todate:"+d2.get(Calendar.YEAR)+"/"+d2.get(Calendar.MONTH)+"/"+d2.get(Calendar.DATE));
        }

}
