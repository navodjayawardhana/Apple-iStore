
package data;
import business.device;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class deviceDB implements Idevice{

    @Override
    public void delete(int dkID){
        String data;
        String deviceID =String.valueOf(dkID);
        boolean deleted = false;
        ArrayList arr=new ArrayList<>();



        try{

            BufferedReader dr = new BufferedReader(new FileReader("Device.txt"));


            while((data = dr.readLine())!=null){
                String[] sData = data.split(",");

                if(sData[0].equals(arr)){
                    deleted = true;
                    continue;
                }
                else{
                    int DeviceID = Integer.valueOf(sData[0]);
                    String deviceName = sData[1];
                    String price = sData[3];
                    int qnty = Integer.valueOf(sData[4]);
                    String Category = sData[5];

                    device dk =new device(DeviceID,deviceName,price,qnty,Category);
                    arr.add(dk.Print());
                    
                }
            }
            if(deleted){
                BufferedWriter dw =new BufferedWriter(new FileWriter("Device.txt",true));
                dw.write("");
                int i = 0;
                while(i<arr.size()){
                    String line =String.valueOf(arr.get(i));
                    dw.append(line+"\n");
                    i++;
                }
                JOptionPane.showMessageDialog(null, "Deleted Sucessfully!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Deleted!");
            }
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
    
}


