import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static List<InputMaterial> inputMaterialsList = new ArrayList<>();
    public static List<OutMaterial> outMaterialList = new ArrayList<>();
    public static List<Material> materialList = new ArrayList<>();

    static {
        Material  material1 = new Material("1","A", 9);
        Material  material2 = new Material("2","B", 9);
        Material  material3 = new Material("3","C", 9);
        Material  material4 = new Material("4","D", 9);
        InputMaterial inputMaterial1 = new InputMaterial(material1,LocalDate.now());
        InputMaterial inputMaterial2 = new InputMaterial(material2,LocalDate.now());
        InputMaterial inputMaterial3 = new InputMaterial(material3,LocalDate.now());
        InputMaterial inputMaterial4 = new InputMaterial(material4,LocalDate.now());
        inputMaterialsList.add(inputMaterial1);
        inputMaterialsList.add(inputMaterial2);
        inputMaterialsList.add(inputMaterial3);
        inputMaterialsList.add(inputMaterial4);


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("nhập ID");
        String id = sc.nextLine();
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        int number = Integer.parseInt(sc.nextLine());
        Material material = new Material(id,name,number);
        OutMaterial outMaterial = new OutMaterial(material,LocalDate.now());
        outMaterialList.add(outMaterial);

        for (OutMaterial outMaterial1: outMaterialList){
            System.out.println(outMaterial1.toString());
        }

        for (InputMaterial inputMaterial : inputMaterialsList) {
            System.out.println(inputMaterial.toString());
        }
    }




}