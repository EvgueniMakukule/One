//Sunday.eam
import java.io.*;
public class Validar {
BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
private int numb;
private String line;
private char ch;
   
public int validarInt(int min,int max, String msg) throws IOException{
System.out.println(msg);

do{
    try{
       // int numb;
        numb= Integer.parseInt(key.readLine());
        if(numb<=min || numb>=max){System.out.println("Invalido!");}
       } catch(NumberFormatException e){System.out.println("Erro de Input!");}
    }while(numb<=min || numb>=max);

            
return numb;}


public String validarString(String msg) throws IOException{
    System.out.println(msg);
    
    do{
        try{
          
            line= key.readLine();
            if(line.isEmpty() || line.isBlank() ){System.out.println("Invalido!");}
           } catch(IOException e){System.out.println("Erro de Input!");}
        }while(line.isEmpty() || line.isBlank());
    
                
    return line;}

    
public char validarChar(String msg) throws IOException{
        System.out.println(msg);
       do{
            line = key.readLine(); 
       if(!((line.equalsIgnoreCase("m")) || (line.equalsIgnoreCase("f")))){System.out.println("Erro de inPut!");};
       }while(!((line.equalsIgnoreCase("m")) || (line.equalsIgnoreCase("f"))));
        
         ch=line.charAt(0);       
        return ch;}


public int validarInt(int min,int max) throws IOException{
           
            
            do{
                try{
                   // int numb;
                    numb= Integer.parseInt(key.readLine());
                    if(numb<=min || numb>=max){System.out.println("Invalido!");}
                   } catch(NumberFormatException e){System.out.println("Erro de Input!");}
                }while(numb<=min || numb>=max);
            
                        
            return numb;} 
}
    