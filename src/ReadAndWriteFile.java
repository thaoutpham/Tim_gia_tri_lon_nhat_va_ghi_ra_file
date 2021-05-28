import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndWriteFile {
    public int readAndWriteFile(String filePath){
//        ArrayList<Integer> arrayList=new ArrayList<>();
        try {
            File file=new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            int max=0;
            while ((line=br.readLine())!=null){
//             arrayList.add(Integer.parseInt(line));
                int number=Integer.parseInt(line);
                if(number>max){
                    max=number;
                }
            }return max;


        } catch (Exception e) {
            System.out.println("File không tồn tại");
        }
       return 0;
    }

//    public int max(ArrayList<Integer> arrayList){
//        int max=0;
//        for(int i=0;i<arrayList.size();i++){
//            if(arrayList.get(i) >max){
//                max=arrayList.get(i);
//            }
//        }
//        return max;
//    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file:");
        Scanner scanner=new Scanner(System.in);
        String path=scanner.nextLine();
        ReadAndWriteFile rawf=new ReadAndWriteFile();
        System.out.println(rawf.readAndWriteFile(path));



    }
}
