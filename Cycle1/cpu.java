public class cpu{
   
     class processor{
        int cores;
        String producer;
        processor(int noC, String manu){
            cores=noC;
            producer=manu;
        }
        void display(){
       System.out.println("\nPROCESSOR DETAILS");
        System.out.println("No. of Cores = "+cores);
        System.out.println("Manufacturer = "+producer+"\n");
    }
    }
    static class ram{
        int mem;
        String manuf;
        ram(int memory,String producer ){
            mem=memory;
            manuf=producer;
        }
        void display(){
        System.out.println("\nName:BLESSEY MARIA KURIAN\nReg No:22MCA019\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:28/03/2023\n");
        System.out.println("\nRAM DETAILS");
        System.out.println("Memory = "+mem+" GB");
        System.out.println("Manufacturer = "+manuf+"\n");
    }}
    public static void main(String[] args) {
         cpu.ram obj1= new cpu.ram(8,"Intel");
         cpu obj2 = new cpu();
         cpu.processor obj3 = obj2.new processor(8,"Samsung");
         obj1.display();
         obj3.display();

    }
}
