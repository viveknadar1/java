/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package prob02;

/*import java.util.*;
import java.math.*;

*//**
 *
 * @author Hazzard
 * Code wars 2011 Divide by 11
 *//*
public class Prob02 {

    *//**
     * @param args the command line arguments
     *//*
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        int numberCount = 0;
        
        BigInteger number, original;
        BigInteger hundred = new BigInteger("100");
        BigInteger eleven = new BigInteger("11");
        numberCount = scan.nextInt(); // read in character count
        scan.nextLine();  // skip next line

        for (int i = 0; i < numberCount; i++) {
            original= number = new BigInteger(scan.nextLine());
            

            while (1 == 1) {
                System.out.println(number);

                if (number.compareTo(hundred) < 0)
                    break;
                BigInteger rem = number.remainder(BigInteger.TEN);
                number = number.divide(BigInteger.TEN);
                number = number.subtract(rem);

            }

            BigInteger rem = number.remainder(eleven);
            if (rem.compareTo(BigInteger.ZERO)== 0)
                System.out.println(
                        "The number "+ original+ " is divisible by 11.");
            else
                System.out.println(
                        "The number "+ original+ " is not divisible by 11.");
        }

    }
}
*/
//import java.io.File;
//import java.io.IOException;
//import java.util.Date;
//import java.nio.file.Files;
////import org.apache.commons.io.FileUtils;
//
//
///**
// * Simple Java program to copy files from one directory to another directory.
// * Java IO API doesn't provide any direct way to copy files but you can copy files
// * by copying its contents from InputStream to OutputStream. Though there are some
// * better ways to do it like Using Apache Commons Utils library has FileUtils class
// * to copy files in Java
// *
// * @author Javin
// */
//public class Prob02 {
//
//   
//    public static void main(String args[]) throws IOException {
//        //absolute path for source file to be copied
//        String source = "C:/sample.txt";
//        //directory where file will be copied
//        String target ="C:/Test/";
//     
//        //name of source file
//        File sourceFile = new File(source);
//        String name = sourceFile.getName();
//     
//        File targetFile = new File(target+name);
//        System.out.println("Copying file : " + sourceFile.getName() +" from Java Program");
//     
//        //copy file from one location to other
//        FileUtils.copyFile(sourceFile, targetFile);
//     
//        System.out.println("copying of file from Java program is completed");
//    }
//   
//}
//
//



 
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
 
/**
 *
 * @author Abhijit Ghosh
 * @version 1.0
 */
public class Prob02 {
 
    public static void main(String[] args) throws IOException {
        // File to be copied
       Path srcFile = Paths.get("/home/vivek/season/");
    //	Path srcFile = Paths.get("/media/38F8A834F8A7EE76/season");
        // Copied file
        Path targetFile = Paths.get("/home/vivek/Desktop/");
         
        Path tempFilePath = Files.createTempFile(targetFile, "temp", "a",new FileAttribute<?>[0]);
        // configure how to copy or move a file.
        CopyOption[] options = new CopyOption[] {StandardCopyOption.REPLACE_EXISTING};
         
        // Copy srcFile to targetFile
        Files.copy(srcFile, tempFilePath, options);

        System.out.println("copy Done");
    }

}




