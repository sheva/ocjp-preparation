package locale;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/* And there are 2 props files:
   1. myprops.properties
      okLabel=OK
      cancelLabel=Cancel
   2. myprops_en_UK.properties
      okLabel=YES
      noLabel=NO


    Q: what will be the result of compilation and run?
       1. will not compile
       2. it will not print anything
       3. okLabel=OK, cancelLabel=Cancel
       4. okLabel=OK, noLabel=NO
       5. noLabel=NO, okLabel=YES, cancelLabel=Cancel
       6. noLabel=No, okLabel=OK, cancelLabel=Cancel

    A: 5)  noLabel=NO, okLabel=YES,cancelLabel=Cancel
 */

public class SimplePropsFiles {
    Locale locale = new Locale.Builder().setLanguage("en").setRegion("UK").build();
    ResourceBundle resourceBundle = ResourceBundle.getBundle("myprops", locale);

    Enumeration<String> en = resourceBundle.getKeys();

//    while(en.hasMoreElements()) {
//        String key = en.nextElement();
//        String value = resourceBundle.getString(key);
//        System.out.println("key: " + key + " value:" + value);
//    }

}
