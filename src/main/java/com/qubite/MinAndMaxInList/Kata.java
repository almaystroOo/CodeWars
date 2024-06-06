package com.qubite.MinAndMaxInList;//
//import okhttp3.*;
//
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.security.NoSuchAlgorithmException;
//import java.text.DecimalFormat;
//
//
//public class signature  {
//
//
//
//    public static  String sender() throws IOException {
//    OkHttpClient client = new OkHttpClient();
//    RequestBody body = new FormBody.Builder()
//            .add("token", "s54lw9ce5ba9wi0h")
//            .add("to", "+249912218405")
//            .add("body", "hello from ONB whatsapp service")
//
//
//            .build();
//
//    Request request = new Request.Builder()
//            .url("https://api.ultramsg.com/instance79964/messages/chat")
//            .post(body)
//            .addHeader("content-type", "application/x-www-form-urlencoded")
//            .build();
//
//        try (Response response = client.newCall(request).execute()) {
//            return response.toString();
//        }
//
//
//    }
////
////
////
////public class signature {
////    public static String getSignature(BigDecimal amount, String billNo, String key) throws NoSuchAlgorithmException {
////        String st = amount + billNo + key;
////        MessageDigest md = MessageDigest.getInstance("MD5");
////        md.update(st.getBytes());
////        byte[] digest = md.digest();
////        BigInteger bigInt = new BigInteger(1, digest);
////        StringBuilder hashed = new StringBuilder(bigInt.toString(16));
////        while(hashed.length() < 32 ){
////            hashed.insert(0, "0");
////        }
////        return hashed.toString();
////    }
//    public static void main(String args[]) throws NoSuchAlgorithmException, IOException {
//
//
//      //  String var = "690de27b89416fc61a43e2c665c3625f";
////        //String getSig = getSignature(BigDecimal.valueOf(5020),"77183427",var);
////       // String sent = sender();
////      //  System.out.println(        BigDecimal.valueOf(Long.( "500.00"))
////        long number = Double.valueOf("6.6728664E7").longValue();
//////        DecimalFormat format = new DecimalFormat("#000,0000.000");
//////        String formattedNumber = format.format("6.67286640");
////        System.out.println(number);
//
//        //  System.out.println(sent.toString());
//        //BigDecimal dec = 1.000;
//
//     //   System.out.println(getSig);
//
//    } //static method
//
//}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata {

    public int min(int[] list) {
        int min = list[0];
        //Arrays.stream(list).
        for (int j : list) {
            if (j < min) {
                min = j;
            }
        }
        return min;
       // return ((String) min));
    }

    public int max(int[] list) {
        int max = list[0];
        for (int j : list) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    @Test
    public void testExamples() {
        assertEquals(-49363254, min(new int[]{-52, 56, 30, 29, -54,-49363254, 0, -110}));
        assertEquals(0,min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, min(new int[]{5}));
    }
}

