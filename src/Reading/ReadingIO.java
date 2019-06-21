/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Reading;
import java.io.*;
import java.util.*;
/**
 *
 * @author E.E
 */
public class ReadingIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // converted the tabed data in the text file into two-diminision array
        String dataset[][]=new String[100][15];
           // InputStream is used to read binary data
           // reader is used to read text(unicode characters)
        FileInputStream inputfile=new FileInputStream("Adult.txt");
            InputStreamReader Im=new InputStreamReader(inputfile);
            BufferedReader br=new BufferedReader(Im);
            System.out.println("Text from File is as Follows..");
           
            for(int i=0;i<100;i++){
                int j=0;
                String text=br.readLine();
                StringTokenizer st=new StringTokenizer(text,",");
                 while(st.hasMoreTokens()){
                   dataset[i][j]=st.nextToken();
                   j++;
                 }
                System.out.println(dataset[i][13]+ "\t"+ dataset[i][14]);
                           }
  //Applying Generalixzation      
            
            
  
        
        // TODO code application logic here
    }}
