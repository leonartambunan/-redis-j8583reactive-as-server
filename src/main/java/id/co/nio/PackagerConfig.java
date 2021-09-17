//package id.co.nio;
//
//import com.solab.iso8583.IsoType;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.LineIterator;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//public class PackagerConfig {
//
//    public static Map<Integer, IsoType> isoTypeMap = new HashMap<>();
//    public static Map<Integer, Integer> isoLengthMap = new HashMap<>();
//
//    private String readFile(File file) throws Exception {
//        StringBuilder stringBuilder = new StringBuilder();
//        LineIterator it = FileUtils.lineIterator(file, "UTF-8");
//        try {
//            while (it.hasNext()) {
//                String line = it.nextLine();
//                stringBuilder.append(line);
//                stringBuilder.append("\n");
//            }
//        } finally {
//            it.close();
//        }
//
//        return stringBuilder.toString();
//    }
//
//
//}
