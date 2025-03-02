import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;

public class Myfunc {
     public ImageIcon resizePic(String picPath ,byte[] BLOBpic,int wdth , int hgt){
        ImageIcon myImg;
         if(picPath != null){
            myImg = new ImageIcon(picPath);
         }else{
          myImg = new ImageIcon(BLOBpic);

         }
        Image img = myImg.getImage().getScaledInstance(wdth,hgt,Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(img);
        return myPicture;
    }
    public String displaybtn(JLabel lbl){
    String path = ""; 
    JFileChooser filec = new JFileChooser();
filec.setCurrentDirectory(new File(System.getProperty("user.home")));

//file extention
FileNameExtensionFilter filefilter =new FileNameExtensionFilter("*.Images","jpg","png","gif");
filec.addChoosableFileFilter(filefilter);
int  fileState = filec.showSaveDialog(null);
//user select
if(fileState == JFileChooser.APPROVE_OPTION ){
    File selectedFile = filec.getSelectedFile();
     path = selectedFile.getAbsolutePath();
//imagepth = path; 

//display picture using resize image

lbl.setIcon(resizePic(path,null,lbl.getWidth(),lbl.getHeight()));

//displaypic.setIcon(new ImageIcon(path));
 }
//user cancel
else if(fileState == JFileChooser.CANCEL_OPTION){
    System.out.println("No Image Selected");
    
}
         return path;
    
        }
    
}
